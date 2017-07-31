package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.model.Point;

@Configuration
@ComponentScan(basePackages={"com.bean"})
@Import(value={ConfigurationClass2.class,ConfigurationClass3.class})
public class ConfigurationClass {}
