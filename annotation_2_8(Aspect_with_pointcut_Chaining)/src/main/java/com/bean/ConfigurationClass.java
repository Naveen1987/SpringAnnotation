package com.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy// for enable Aspect programming support
@ComponentScan(basePackages={"com.bean","com.model","com.aspects"})
public class ConfigurationClass {	
}
