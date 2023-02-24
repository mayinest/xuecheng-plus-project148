package com.xuecheng.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description TODO
 * @date 2023/2/24 14:44
 */

@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsFilter getCorsFilter(){

        CorsConfiguration configuration = new CorsConfiguration();

        //添加哪些http方法可以跨域，比如：GET,POST,(多个方法中间以逗号分隔)，*号表示所有
        configuration.addAllowedMethod("*");
        //添加允许那个请求进行跨域，*表示所有，可以具体制定什么地址
        configuration.addAllowedOrigin("*");
        //所有头信息全部放行
        configuration.addAllowedHeader("*");
        //允许跨域发送cookie
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",configuration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }





}
