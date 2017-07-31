package com.demo.annotation_2_1;

import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import com.bean.ConfigurationClass;
import com.model.Artist;
@EnableSpringConfigured
public class App {
    public static void main( String[] args )    {
    	
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
    	context.scan("com.bean");
    	context.refresh();
    	Artist artist = (Artist)context.getBean(Artist.class);
    	artist.save();
    	 }
    }
