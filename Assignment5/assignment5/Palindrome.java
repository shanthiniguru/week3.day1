package org.assignment5;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i =str.length()-1; i >=0 ; --i) {
			char a = str.charAt(i);
			
			rev = rev + a;
			
		}
		System.out.println(rev);
	}
	
			
}