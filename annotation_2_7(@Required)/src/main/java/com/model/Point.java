package com.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

//@Component
public class Point {
private int x;
private int y;
@Override public String toString() {	return "Point [x=" + x + ", y=" + y + "]";}
public int getX() {	return x;}
public void setX(int x) {	this.x = x;}
public int getY() {	return y;}
@Required
public void setY(int y) {	this.y = y;}}
