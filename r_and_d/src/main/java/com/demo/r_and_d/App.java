package com.demo.r_and_d;

/**
 * Hello world!
 *
 */
class A{
	public void show(){
		System.out.println("I am A");
	}
}
class B extends A{
	public void disp(){
		System.out.println("I am B");
	}
}
public class App 
{
    public static void main( String[] args )
    {
       Object a=new B();
       A m=(A)a;
       B n=(B)a;
       ((A)a).show();
       ((B)a).show();
       ((B)a).disp();
    }
}
