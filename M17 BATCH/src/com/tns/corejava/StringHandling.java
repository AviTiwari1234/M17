package com.tns.corejava;

public class StringHandling {

	public static void main(String[] args) {
		String s=new String("AVANTIKA");
	//	String s2=new String("avantika");//immutable
		
		System.out.println(s.length());
		
		String lower=s.toLowerCase();
		System.out.println(lower);
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s.replace('A','k'));
		System.out.println(s.substring(2,6));
		
		System.out.println(s.equalsIgnoreCase("avantika"));
		

	}

}
