package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {
@Before("execution(public double add(double , double ))")
public void logBefore() {
System.out.println("The method add() begins");
}
}