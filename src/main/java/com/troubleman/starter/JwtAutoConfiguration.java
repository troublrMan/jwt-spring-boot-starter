package com.troubleman.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * jwt自动装配类（最重要的类，没有此类，spring boot不会自动扫描jar
 */
@Configuration
@ConditionalOnClass(JwtService.class)
@EnableConfigurationProperties(JwtProperties.class)
public class JwtAutoConfiguration {

    @Autowired
    private JwtProperties jwtServiceProperties;

    /**
     * 创建相关的bean
     *
     * @return JwtService
     */
    @Bean
    JwtService jwtService() {
        return new JwtService(jwtServiceProperties.getBase64Security(), jwtServiceProperties.getIssuer());
    }

//    @Bean
//    JwtUtils jwtUtils() {
//        return new JwtUtils();
//    }

    /**
     * 创建bean 的一些判断条件注解 （最好自定义starter加入以下判断）
     * @return JwtUtils
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "jwt",value ="enabled",havingValue = "true")
    JwtUtils jwtUtils() {
        return new JwtUtils();
    }

}
