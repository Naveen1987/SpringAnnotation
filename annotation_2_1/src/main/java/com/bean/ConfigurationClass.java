package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.Point;

@Configuration
//@ComponentScan(basePackages={"com.bean","com.model"})
public class ConfigurationClass {

	@Bean
	public Point point(){
		Point p=new Point();
		p.setX(10);
		p.setY(20);
		return p;
	}
}
