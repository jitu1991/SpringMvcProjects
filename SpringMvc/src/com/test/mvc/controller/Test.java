package com.test.mvc.controller;

public class Test {
	public static void main(String[] args) {
		int i = 4;
		String str = "Only %s can be selected";
		String format = String.format(str, i);
		System.out.println(format);
	}
}
