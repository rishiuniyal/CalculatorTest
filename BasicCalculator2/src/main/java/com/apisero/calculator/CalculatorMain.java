package com.apisero.calculator;
public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator obSum=new Calculator();
		Calculator obSub=new Calculator();
		Calculator obMul=new Calculator();
		Calculator obDiv=new Calculator();
		
		System.out.println("Sum: "+obSum.sum(5,3)+" Subtraction: "+obSub.sub(5,3)+" Multiplication: "+obMul.mul(5,3)+" Division: "+obDiv.div(5,3));
		
	}

}
