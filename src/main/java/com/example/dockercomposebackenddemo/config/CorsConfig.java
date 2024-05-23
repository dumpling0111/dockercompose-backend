package com.example.dockercomposebackenddemo.config;


// 在你的Spring Boot应用中添加一个配置类
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 允许访问/api/* 路径
                .allowedOrigins("http://localhost:8081")  // 允许的源列表
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 允许的方法
                .allowedHeaders("*")  // 允许的头信息
                .allowCredentials(true)  // 是否允许证书（cookies等）
                .maxAge(3600);  // 预检请求的缓存时间（秒）
    }
}
