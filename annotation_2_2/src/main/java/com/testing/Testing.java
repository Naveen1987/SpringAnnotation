package com.testing;

public class Testing {
public static void main(String ag[]){
	int x=0;
	for(int i=0;i<10;i++){
		x=show(x);
		System.out.println(x);
	}
}
public static int show(int x){
//	if(x==1){x=0;}
//	else{x=1;}
	return (x=1-x);
}
}
