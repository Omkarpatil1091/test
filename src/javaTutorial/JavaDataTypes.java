package javaTutorial;

public class JavaDataTypes {

	//Data types are divided into two groups:
	//1)Primitive
		
	public static void main(String[]args) {
		byte b=127;
		short s=32767;
		int i=1000000000;
		long l=1234567899;
		float f=10.10f;
		double d=100.100d;
		boolean bool= true;
		boolean bool2=false;
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(bool2);
		char grade='A';
		char grade1=65;	//ASCII values
		
		System.out.println(grade);
		System.out.println(grade1);
		
		float f1=35e3f;	//Scientific numbers
		float f2=35e4f;
		double d1=35E3d;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(d1);
	

//2)Non-primitive
	
		// 1) String
		String word="Hello omkar";
		System.out.println(word);
		
		String text="abcdefghijklmnopqrstvswxyz";
		System.out.println("The length of "+text.length());
		
		String text1="How are you";
		System.out.println(text1.toLowerCase());
		System.out.println(text1.toUpperCase());
		
		String text2="Please locate where 'locate' occurs!";
		System.out.println(text2.indexOf("locate"));
		
		// 2) Array
		 String cars[]={"BMW","AUDI","THAR","VOLVO"};
		//You can access an array element by referring to the index number.
		System.out.println(cars[2]);
		System.out.println(cars.length);
		
		cars[2]="RUBICON";
		System.out.println(cars[2]);
		
		// 3) Classes/object
		public class Main  //--Create seperate Calss in java & run.
		{
			int x=5;
		
		public static class main(String[] args)
		{
			Main myObj= new Main;
			System.out.println(myObj.x);
					
		}
		// 4) Interface
		interface Animal {
		  public void animalSound(); // interface method (does not have a body)
		  public void sleep(); // interface method (does not have a body)
		}

		// Pig "implements" the Animal interface
		class Pig implements Animal {
		  public void animalSound() {
		    // The body of animalSound() is provided here
		    System.out.println("The pig says: wee wee");
		  }
		  public void sleep() {
		    // The body of sleep() is provided here
		    System.out.println("Zzz");
		  }
		}

		class Main {
		  public static void main(String[] args) {
		    Pig myPig = new Pig();  // Create a Pig object
		    myPig.animalSound();
		    myPig.sleep();
		  }
		}
		
	}	
}
	
		
		
