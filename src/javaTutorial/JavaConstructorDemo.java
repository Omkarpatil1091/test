package javaTutorial;

public class JavaConstructorDemo {

	int a;
	int b;
	int c;
	
	JavaConstructorDemo() {
		a=10;
		b=10;
		c=a+b;
		System.out.println(c);
	}
	JavaConstructorDemo(int a) {
		a=100;
		b=100;
		c=a+b;
		System.out.println(c);
	}
	JavaConstructorDemo(int a, int b) {
		a=1000;
		b=1000;
		c=a+b;
		System.out.println(c);
	}

	public static void main (String[]args) {
		JavaConstructorDemo demo=new JavaConstructorDemo(50);
		JavaConstructorDemo demo1=new JavaConstructorDemo(50,80);
		JavaConstructorDemo demo11=new JavaConstructorDemo();


		
		
	}
}

