package com.wayne.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.wayne.controller","com.wayne.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
