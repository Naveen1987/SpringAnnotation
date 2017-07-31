package com.demo.annotation_2_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bean.ConfigurationClass;
import com.model.Point;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext();
    	//ConfigurationClass.class
    	  con.scan("com.bean","com.model");
    	  con.refresh();
    	  Point p=(Point)con.getBean(Point.class);
    	  System.out.println(p);
    }
}
