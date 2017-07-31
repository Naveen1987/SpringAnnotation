package com.demo.annotation_2_1;

import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bean.ConfigurationClass;
import com.model.ArithmeticCalculator;
import com.model.MaxCalculator;
import com.model.MinCalculator;
import com.model.UnitCalculator;


public class App {
    public static void main( String[] args )    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	ArithmeticCalculator arithmeticCalculator =
    			(ArithmeticCalculator) context.getBean("arithmeticCalculator");
    			arithmeticCalculator.add(1, 2);
//    			arithmeticCalculator.sub(4, 3);
//    			arithmeticCalculator.mul(2, 3);
//    			arithmeticCalculator.div(4, 2);
    			UnitCalculator unitCalculator =
    					(UnitCalculator) context.getBean("unitCalculator");
    					unitCalculator.kilogramToPound(10);
//    					unitCalculator.kilometerToMile(5);
    					//Now introduce interface implementation
/*Important Note- 
 1. Directly with arithmeticCalculator object you can not call to max(1,2) method for it
 you will have to type case it with MaxCalculator now you can call method.
 2.  These two interfaces(MaxCalculator,MinCalculator) implementation added with arithmeticCalculator object at 
 runtime. this is the task of @DeclareParents().
 3. arithmeticCalculator implemented from two classes (which break the rule of java but possible in AOP) at runtime.
 conceptually (physically) not possible but AOP done it at runtime. so it is called special behavior of AOP come with
 INTRODUCTION
 4. for better understanding go through the book page-197 read example begining to end
 */
    			MaxCalculator maxCalculator = (MaxCalculator) arithmeticCalculator;
    			maxCalculator.max(1, 2);
    			
    			MinCalculator minCalculator = (MinCalculator) arithmeticCalculator;
    			minCalculator.min(1, 2);
    	 }
    }
