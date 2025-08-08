package com.hidalgocarlos.inventory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // This class can be used to configure various aspects of Spring MVC.
    // You can add methods to customize view resolvers, message converters, etc.

    // Example: You can override methods from WebMvcConfigurer to customize the configuration
    // @Override
    // public void addViewControllers(ViewControllerRegistry registry) {
    //     registry.addViewController("/").setViewName("index");
    // }
    // @Override
    // public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    //     converters.add(new MappingJackson2HttpMessageConverter());
    //     // Add other converters as needed
    // }

    public void addCorsMappings(CorsRegistry registry) {

        // Configure CORS mappings to allow requests from specific origins
        registry.addMapping("/**") // Allow all paths
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow specific HTTP methods
                .allowedHeaders("*"); // Allow all headers

    }

}
