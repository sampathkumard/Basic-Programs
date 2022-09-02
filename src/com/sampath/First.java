package com.sampath;

public class First{
	public static void main(String[] args) {
		///reverse the string////////
		String s = "sampath";
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		sb.reverse();
//		System.out.println(sb);
		
		//////using char[]/////////////
		
		char[] c= s.toCharArray();
		for(int i=c.length-1; i>=0; i--){
			System.out.print(c[i]);
		} 
			}
			
	
}



