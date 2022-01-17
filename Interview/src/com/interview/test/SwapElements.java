package com.interview.test;

public class SwapElements {

	
	//code for swapping elements
	public static void main(String[] args) {
		int x=-13;
		int y=20;
		
		//code for swapping
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("after swap: "+x+"+ "+y+"");
	}
}
