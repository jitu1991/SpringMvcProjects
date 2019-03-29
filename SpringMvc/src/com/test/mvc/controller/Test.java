package com.test.mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("RCAST_EXPOSUE_SUM");

		Optional<String> findFirst = list.stream().filter(x -> x.matches("RCAST_EXPOSURE_SUM | RCAST_STRESS"))
				.findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		} else {
			System.out.println("Not matched");
		}

		/*
		 * int i = 4; String str = "Only %s can be selected"; String format =
		 * String.format(str, i); System.out.println(format);
		 * 
		 * String s = "a"; String m = "a"; if(s.matches("a||b||c"))
		 * System.out.println("matched");
		 */
	}
}
