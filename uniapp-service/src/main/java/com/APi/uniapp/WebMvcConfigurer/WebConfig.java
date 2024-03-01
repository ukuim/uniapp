package com.APi.uniapp.WebMvcConfigurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/")
                .setCacheControl(CacheControl.maxAge(30, TimeUnit.DAYS));
        // 添加其他静态资源位置
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/images/");
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/css/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/js/");
        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/fonts/");
        registry.addResourceHandler("/lib/**")
                .addResourceLocations("classpath:/lib/");


    }
}