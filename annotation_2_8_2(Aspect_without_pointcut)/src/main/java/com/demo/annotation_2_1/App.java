package com.demo.annotation_2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bean.ConfigurationClass;
import com.model.ArithmeticCalculator;
import com.model.UnitCalculator;

public class App {
    public static void main( String[] args )    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	ArithmeticCalculator arithmeticCalculator =
    			(ArithmeticCalculator) context.getBean("arithmeticCalculator");
    			arithmeticCalculator.add(1, 2);
    			arithmeticCalculator.sub(4, 3);
    			arithmeticCalculator.mul(2, 3);
    			arithmeticCalculator.div(4, 2);
    			UnitCalculator unitCalculator =
    					(UnitCalculator) context.getBean("unitCalculator");
    					unitCalculator.kilogramToPound(10);
    					unitCalculator.kilometerToMile(5);
    	 }
    }
