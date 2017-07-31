package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.Point;

@Configuration
@ComponentScan(basePackages={"com.bean","com.model","com.dao"})
public class ConfigurationClass {}
