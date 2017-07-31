package com.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@EnableAspectJAutoProxy
@EnableSpringConfigured
// for enable Aspect programming support
@EnableLoadTimeWeaving(aspectjWeaving=AspectJWeaving.ENABLED)
@ComponentScan(basePackages={"com.model"})
public class ConfigurationClass {	
}
