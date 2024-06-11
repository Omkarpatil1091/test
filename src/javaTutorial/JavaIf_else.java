package javaTutorial;

public class JavaIf_else {

	/*Use 'if' to specify a block of code to be executed, if a specified condition is true
	Use 'else' to specify a block of code to be executed, if the same condition is false
	Use 'else if' to specify a new condition to test, if the first condition is false
	Use 'switch' to specify many alternative blocks of code to be executed*/
	
	public static void main(String[]args) {
		int x=20;
		int y=18;
			
		if (20<18) {
			System.out.println("true\\yes");
			}
		else {
			System.out.println("False\\no");
		}
		
		int time=12;
		if (time>12) {
			System.out.println("GM");
		}else {
			System.out.println("GE");
		}
/*********************************else if**********************************************/
		if (time<10) {
			System.out.println("Gm");
		}else if (time<10)
		{
			System.out.println("GE");
		}else {
			System.out.println("GN");
		}
		
		String result=(time<=12)? "True":"False";
		System.out.println(result);
		}}


