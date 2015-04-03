package com.springapp.mvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *   Replaces the servlet dispatcher configuration in mvc-dispatcher-servlet.xml
 *
 *   <context:component-scan base-package="com.springapp.mvc.controller" />
 *
 *   <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
 *       <property name="prefix" value="/WEB-INF/pages/"/>
 *       <property name="suffix" value=".jsp"/>
 *   </bean>
 *
 *   <mvc:resources mapping="/resources/**" location="/WEB-INF/resources/" />
 *
 *   <mvc:annotation-driven />
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.springapp.mvc.controller")
public class DispatcherConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
        registry.setOrder(-1);
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass( JstlView.class );
        viewResolver.setPrefix( "/WEB-INF/pages/" );
        viewResolver.setSuffix( ".jsp" );
        return viewResolver;
    }
}
