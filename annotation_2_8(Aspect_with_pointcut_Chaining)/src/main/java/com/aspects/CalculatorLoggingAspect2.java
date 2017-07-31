package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect2 {

	@Before("CalculatorLoggingAspect.go()")
public void logBefore() {
System.out.println("The method add() begins 0");
}
}