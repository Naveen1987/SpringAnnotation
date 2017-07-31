package com.newbean;

import org.springframework.stereotype.Component;

@Component//(value="tri")
public class Tri implements Figure {
	public Figure getObject() {		return this;	}
	@Override	public String toString() {		return "I am Tri";	}
}
