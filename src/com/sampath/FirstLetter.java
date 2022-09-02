package com.sampath;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetter {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("sam", "div", "dish", "dost");
		l.stream().filter(e-> e.endsWith("m")).collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

}
