package com.veronicatee.movieapp;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/homepage").setViewName("homepage");
        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/register").setViewName("login");
//        registry.addViewController("/welcome").setViewName("homepage2");
    }

}
