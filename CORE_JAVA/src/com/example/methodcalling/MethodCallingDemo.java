package com.example.methodcalling;

class MethodCallingDemo {

	public static void main(String[] args) {

		int i = 1;
		int result = changeValue(i);
		System.out.println("i is :"+result);
		
	}

	private static int changeValue(int i) {
		i = i+1;
		return i;
	}

}
