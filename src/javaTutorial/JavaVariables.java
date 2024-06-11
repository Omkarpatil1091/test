package javaTutorial;

public class JavaVariables {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "OMKAR";
		int myNum=15;
		System.out.println(name);
		System.out.println(myNum);
		System.out.println(name + myNum);
		
		int number;
		number=1234;
		System.out.println(number);
		
		int NO=10;
		NO = 20;		//Overwrite
		System.out.println(NO);
		
		final int mynum=50;
		 /*mynum=60; //will generate an error: cannot assign a value to a final variable*/
		System.out.println(mynum);
		
		int MH=10;
		System.out.println(MH);
		float myFloatno=50.50f;
		System.out.println(myFloatno);
		char letter='A';
		System.out.println(letter);
		boolean bool= true;
		System.out.println(bool);
		String mytext="Patil";
		System.out.println(mytext);
	}
}

	