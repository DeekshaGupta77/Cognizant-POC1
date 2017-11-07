package com.java8;


public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java8Test tester = new Java8Test();
		
		MathOperation addition = (int a, int b) -> a+b;
		
		MathOperation substraction = (a, b) -> a-b;
		
		MathOperation multiplication = (int a, int b) -> a*b;
		
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, substraction));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		GreetingService gs1 = message ->
		System.out.println("Hello "+ message);
		
		GreetingService gs2 = message ->
		System.out.println("Hello "+ message);
		
		gs1.sayMessage("Deeksha");
		gs2.sayMessage("Gupta");
	}
		
		private int operate(int i, int j, MathOperation mathOperation) {
		// TODO Auto-generated method stub
		return mathOperation.operation(i,j);
	}

		interface MathOperation
		{
			int operation(int a, int b);
		}
		
		interface GreetingService
		{
			void sayMessage(String message);
		}
		

	}


