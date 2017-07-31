package com.demo.annotation_2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bean.ConfigurationClass;
import com.model.Point;


public class App {
    public static void main( String[] args )    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	Point p=(Point)context.getBean(Point.class);
    	p.setX(1200);//before this method Aspect will execute
    	System.out.println(p);
    	 }
    }
