package com.demo.mongodbdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(ConfigClass.class);
       Point p=(Point)app.getBean(Point.class);
       System.out.println(p);
    }
}
