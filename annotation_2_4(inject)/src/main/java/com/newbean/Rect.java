package com.newbean;

import org.springframework.stereotype.Component;

@Component//(value="rect")
public class Rect implements Figure {
	public Figure getObject() {	return this;	}
	@Override	public String toString() {		return "I am Rect";	}
}
