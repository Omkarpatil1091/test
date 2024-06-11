package javaTutorial;

public class JavaWhileLoop {

	public static void main(String[]args) {
		int i=0;
		while (i<2) {
		System.out.println(i);
		i++;
		}
		int p=0;
		do {
			System.out.println(p);
			p++;
		}
		while (p<2);
		//Note: Do not forget to (i++) increase the variable used in the condition, otherwise the loop will never end!
	}
}
