package com.research.pisatest.common.interceptor;

/**
 * @author zhongqilong
 * @date 2024/8/5 21:03
 * @description
 */
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.RedisUtils;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Map;


/**
 * 管理员权限拦截器
 */
@Component
public class AdminInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 拦截处理：请求处理前先判断该用户是否已登录且有权限
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 从请求头中取出cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            Cookie tokenCookie = Arrays.stream(cookies)
                    .filter(cookie -> "token".equals(cookie.getName()))
                    .findFirst()
                    .orElse(null);

            if (tokenCookie != null) {
                String token = tokenCookie.getValue();
                if (redisUtils.containsKey(token)) {
                    Map<String, String> map = (Map<String, String>) redisUtils.getValue(token);
                    if (map.get("role").equals(Constants.ADMIN)) {
                        return true;
                    }
                }
            }
            return true;
        }

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        return false;
    }
//
//    /**
//     * 拦截处理：请求处理完成后，将用户的token续上时长重新放入redis
//     * @param request
//     * @param response
//     * @param handler
//     * @param modelAndView
//     * @throws Exception
//     */
////    @Override
////    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
////        System.out.println("postHandle...");
////    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("afterCompletion...");
//    }
}