package com.apisero.calculator;

public class Calculator {
private int a,b;
	
	public Calculator() {
		this.a = 0;
		this.b = 0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int sum(int a, int b) {
		return (a+b);
	}
	public int sub(int a, int b) {
		return (a-b);
	}
	public int mul(int a, int b) {
		return (a*b);
	}
	public int div(int a, int b) {
		return (a/b);
	}
}
