package com.silly;

public class Circle extends Shape{
	@Override
	double area() { //������д
		double r = 12;
		return Math.PI * r * r;
	}
}
