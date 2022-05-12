package com.example.recursion;

class FactorialDemo {

	public static void main(String[] args) {

		ComplexFunction complexFuction = new ComplexFunction();
		
		int result = complexFuction.calculateFactorial(5);
		System.out.println("Factorial of 5 is : " + result);
		
		

//		calculateFactorial(5)
//			calculateFactorial(5)
//				calculateFactorial(5)
//					calculateFactorial(5)
//						calculateFactorial(5)
//						return 1 
//					return 2*1= 2 
//				return 3*2= 6
//			return 4*6= 24
//		return 5*24= 120
//						
						
	}

}
