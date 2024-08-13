package com.research.pisatest.common.config;

import com.research.pisatest.common.interceptor.AdminInterceptor;
import com.research.pisatest.common.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhongqilong
 * @date 2024/7/26 20:43
 * @description 跨域连接
 */
@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {
    @Autowired
    private AdminInterceptor adminInterceptor;
    @Autowired
    private UserInterceptor userInterceptor;

    /**
     * 设置跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 设置允许跨域的路径
        registry.addMapping("/**")
                // 设置允许跨域请求的域名
                .allowedOriginPatterns("*")
                // 是否允许证书
                .allowCredentials(true)
                // 设置允许的方法
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                // 设置允许的header属性
                .allowedHeaders("*")
                // 跨域允许时间
                .maxAge(3600);
    }

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 管理员权限拦截器
        registry.addInterceptor(adminInterceptor).addPathPatterns("/admin/**").addPathPatterns("/questionBank/**");
        // 普通用户拦截
        registry.addInterceptor(userInterceptor).addPathPatterns("/user/**").excludePathPatterns("/user/login");
    }
}
