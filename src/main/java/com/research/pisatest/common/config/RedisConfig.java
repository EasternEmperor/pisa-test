package com.research.pisatest.common.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

/**
 * @author zhongqilong
 * @date 2024/8/6 12:48
 * @description
 */
@EnableCaching
@Configuration
@Component
public class RedisConfig extends CachingConfigurerSupport {

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        // 配置 Redis 服务器的连接信息
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();

        // 配置连接池
        GenericObjectPoolConfig<Object> poolConfig = new GenericObjectPoolConfig<>();

        // 创建一个带有连接池配置的 Lettuce 客户端配置
        LettucePoolingClientConfiguration lettucePoolingClientConfiguration =
                LettucePoolingClientConfiguration.builder()
                        .poolConfig(poolConfig)
                        .build();

        // 返回带有连接池配置的 Redis 连接工厂
        return new LettuceConnectionFactory(redisStandaloneConfiguration, lettucePoolingClientConfiguration);
    }

    /**
     * 配置并返回一个 RedisTemplate 实例，用于执行 Redis 操作
     * 意义: RedisTemplate 提供了一种高级抽象，使得开发者可以通过模板方法操作 Redis，而无需直接处理底层的 Redis 命令。
     * 它支持多种 Redis 操作，例如值操作、哈希操作、列表操作等
     * @return RedisTemplate
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        /*
            1.创建 RedisTemplate: 这是 Spring 用于与 Redis 交互的核心类，简化了与 Redis 的交互。
            2.设置连接工厂: 使用前面定义的 LettuceConnectionFactory。
            3.设置序列化器: 设置键和值的序列化器，这里使用 StringRedisSerializer 来将键和值序列化为字符串。
         */
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory());  // 设置连接工厂
        template.setKeySerializer(new StringRedisSerializer());  // 设置键的序列化器
        template.setValueSerializer(new StringRedisSerializer()); // 设置值的序列化器
        return template;
    }
}
