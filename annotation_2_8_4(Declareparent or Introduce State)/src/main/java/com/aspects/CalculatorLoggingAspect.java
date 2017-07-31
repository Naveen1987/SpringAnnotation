package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/*
 @Pointcut("within(com.model.ArithmeticCalculator+)")
public void go_2(){}

@Pointcut("within(com.model.*)")
public void go_3(){}
*/ 
@Aspect
@Component
public class CalculatorLoggingAspect {

//@Pointcut("within(com.model.ArithmeticCalculator+)")
//public void go_1(){}
	
@Pointcut("within(com.model.*)")
public void go_2(){}

//@Pointcut("execution(public double add(double , double ))")
//public void go_3(){}
//
//@Pointcut("execution(public double sub(double , double ))")
//public void go_4(){}
//
//@Pointcut("execution(public double mul(double , double ))")
//public void go_5(){}
//
//@Pointcut("execution(public double div(double , double ))")
//public void go_6(){}
//@Before("go_3()&&go_2()")
//@Before("go_4()&&go_2()")
//@Before("go_5()&&go_2()")
//@Before("go_6()&&go_2()")
//@Before("go_3()&&go_4()")
//@Before("go_4()&&go_5()")
//@Before("go_4()||go_3()||go_2()")
@Before("go_2()")
public void logBefore() {
System.out.println("The method logBefore begins");
}
}