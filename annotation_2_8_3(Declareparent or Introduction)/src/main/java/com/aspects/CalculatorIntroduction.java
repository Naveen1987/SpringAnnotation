package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.model.MaxCalculator;
import com.model.MaxCalculatorImpl;
import com.model.MinCalculator;
import com.model.MinCalculatorImpl;
@Aspect
@Component
public class CalculatorIntroduction {
			@DeclareParents(
			value = "com.model.ArithmeticCalculatorImpl",
			defaultImpl = MaxCalculatorImpl.class)
			public MaxCalculator maxCalculator;
			@DeclareParents(
			value = "com.model.ArithmeticCalculatorImpl",
			defaultImpl = MinCalculatorImpl.class)
			public MinCalculator minCalculator;
	}