package com.sampath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("K");
		l.add("Z");
		l.add("F");                  /////for ascending use naturalOrder
//		l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
//		.forEach(System.out::print);
		
		////using lambda////////
		
		l.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList()).forEach(System.out::print);
	}

}