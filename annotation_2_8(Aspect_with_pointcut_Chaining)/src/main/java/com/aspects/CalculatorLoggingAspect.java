package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class CalculatorLoggingAspect {
@Pointcut("execution(public void setX(int))")
public void go(){}

@Before("go()")
public void logBefore() {
System.out.println("The method logbefore0 begins");
}
}