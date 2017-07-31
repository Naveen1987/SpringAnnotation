package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="Tri")
public class Triangle implements Figure {
	@Autowired private Point p1,p2,p3;
	@Override public String toString() { return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";}
	public Figure show() {		return this;	}
	public Point getP1() {		return p1;	}
	public void setP1(Point p1) {		this.p1 = p1;	}
	public Point getP2() {		return p2;	}
	public void setP2(Point p2) {		this.p2 = p2;	}
	public Point getP3() {		return p3;	}
	public void setP3(Point p3) {		this.p3 = p3;	}}