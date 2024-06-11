package javaTutorial;

public class JavaTypeCasting {

	/*  THERE ARE TWO TYPES:-
	1) Widening Casting (automatically) - converting a smaller type to a larger type size
	byte -> short -> char -> int -> long -> float -> double */

	public static void main(String[]args) {
		int myInt=9;
		double myDouble=myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
	
		char letter='A';
		int number=letter;
		
		System.out.println(letter);
		System.out.println(number);
	
	/*2) Narrowing Casting (manually) - converting a larger type to a smaller size type
	double -> float -> long -> int -> char -> short -> byte*/
	 
		double mydouble=10.50d;
		int myint=(int)mydouble;
		
		System.out.println(mydouble);
		System.out.println(myint);
		
		int num=65;
		char letor=(char) num;
		
		System.out.println(num);
		System.out.println(letor);
	}
	
}
