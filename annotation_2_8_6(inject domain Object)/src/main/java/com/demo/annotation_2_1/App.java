package com.demo.annotation_2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import com.bean.ConfigurationClass;
import com.model.Inner;


public class App { 
public static void main(String[] args) {
	  final AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
	  new Inner().student.show();
	 } 
 }
