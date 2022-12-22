package org.shemenevweb.magnetism.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    final String TEMPLATE_PREFIX = "/WEB-INF/views/";

    public void addViewControllers(ViewControllerRegistry registry) {
        // домашняя страница
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // работа с другими ресурсами
        registry.addResourceHandler(
                "/images/**",
                        "/css/**",
                        "/js/**")
                .addResourceLocations(
                        TEMPLATE_PREFIX + "images/",
                        TEMPLATE_PREFIX + "css/",
                        TEMPLATE_PREFIX + "js/");
    }
}
