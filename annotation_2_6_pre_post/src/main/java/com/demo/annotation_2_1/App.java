package com.demo.annotation_2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bean.ConfigurationClass;
import com.dao.DaoClass;
import com.model.Point;


public class App {
    public static void main( String[] args )    {
    	AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(ConfigurationClass.class);
//    	 DaoClass p=(DaoClass)con.getBean(DaoClass.class);
//    	 System.out.println(p.show());
//    	
    	 }
    }
