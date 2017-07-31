package com.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="Point2")
public class Point2 {
private int x;
private int y;
@Override public String toString() {	return "Point [x=" + x + ", y=" + y + "]";}
public int getX() {	return x;}
public void setX(int x) {	this.x = x;}
public int getY() {	return y;}
public void setY(int y) {	this.y = y;}
@PostConstruct public void init(){	System.out.println("I am INIT Point2");}
@PreDestroy public void destroy(){ 	System.out.println("I am Destroy");}
}
