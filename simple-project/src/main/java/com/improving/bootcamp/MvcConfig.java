package com.improving.bootcamp;

import com.improving.bootcamp.interceptors.LoggingInterceptor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry){
            registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/");
        }
        @Bean
        public ServletRegistrationBean<ExampleServlet> exampleservletbean() {
            ServletRegistrationBean<ExampleServlet> bean = new ServletRegistrationBean<>(
                    new ExampleServlet(), "/exampleServlet/*");
            bean.setLoadOnStartup(1);
            return bean;
        }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggingInterceptor());
    }

    @Bean
    public RestTemplate restTemplate(){
            return new RestTemplateBuilder().build();
    }
}
