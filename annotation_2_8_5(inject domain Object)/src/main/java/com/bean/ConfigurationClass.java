package com.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;

@Configuration
@EnableAspectJAutoProxy// for enable Aspect programming support
@EnableLoadTimeWeaving(aspectjWeaving=AspectJWeaving.AUTODETECT)
@ComponentScan(basePackages={"com.model","com.aspects"})
public class ConfigurationClass {	
}
