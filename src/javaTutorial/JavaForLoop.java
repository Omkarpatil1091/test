package javaTutorial;

public class JavaForLoop {

	
		public static void Outer() {
			for(int k = 0; k < 3; k++) {
				System.out.println(k);
			}
			
			for (int i = 0; i < 5; i=i+2) {
				  System.out.println(i);
				}
			
		}
			public static void main(String[]args) {
				Outer();
				//JavaForLoop.Outer();
			}
	}



