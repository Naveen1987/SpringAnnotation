package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.model.Point;

@Configuration
@ComponentScan(basePackages={"com.bean","com.model","com.dao","com.newbean"})
//@PropertySource("classpath:datafile.properties")
@PropertySource("file:D:\\Kfas Naveen Data\\Notes Here\\datafile.properties")
public class ConfigurationClass {
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//	return new PropertySourcesPlaceholderConfigurer();
//	}
}
