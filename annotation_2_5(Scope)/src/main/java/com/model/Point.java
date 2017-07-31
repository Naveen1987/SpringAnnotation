package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Point {
private @Value("${x}") int x;
private @Value("${y:0}")int y;
@Override public String toString() {	return "Point [x=" + x + ", y=" + y + "]";}
public int getX() {	return x;}
public void setX(int x) {	this.x = x;}
public int getY() {	return y;}
public void setY(int y) {	this.y = y;}}
