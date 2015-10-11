//: Array1.java
// Testing the sorting & searching in Arrays

package chapter8.collections;

import java.util.*;

public class Array1 {
	static Random r = new Random();
	final static String sSOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcedfghijklmnopqrstuvwxyz";
	static char[] src = sSOURCE.toCharArray();
	
	public static String randString(int length){
		char[] buf = new char[length];
		int rnd;
		for(int i=0; i<length; i++){
			rnd = Math.abs(r.nextInt()%src.length);
			buf[i] = src[rnd];
		}
		return new String(buf);
	}
	
	public static String[] randStrings(int length, int size){
		String[] s = new String[size];
		for(int i=0; i<size; i++)
			s[i] = randString(length);
		return s;
	}
	
	public static void print(byte[] b){
		for(int i=0; i<b.length; i++)
			System.out.println(b[i] + " ");
		System.out.println("--------********--------");
	}
	
	public static void print(String[] s){
		for(int i=0; i<s.length; i++)
			System.out.println(s[i] + " ");
		System.out.println("~~~~~~~~^^^^^^^^~~~~~~~~");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[15];
		r.nextBytes(b);
		print(b);
		
		int loc = Arrays.binarySearch(b, b[10]);
		System.out.println("Location of " + b[10] + " = " + loc);
		
		String[] s = randStrings(4,10);
		print(s);
		Arrays.sort(s);
		print(s);
		
		loc = Arrays.binarySearch(s, s[4]);
		System.out.println("Location of " + s[4] + " = " + loc);

	}

}
