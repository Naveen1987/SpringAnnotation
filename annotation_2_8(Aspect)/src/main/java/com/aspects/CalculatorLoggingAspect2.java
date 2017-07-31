package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(0)
public class CalculatorLoggingAspect2 {
@Before("execution(public void setX(int))")
public void logBefore() {
System.out.println("The method add() begins 0");
}
}