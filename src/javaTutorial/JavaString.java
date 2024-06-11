package javaTutorial;

public class JavaString {

	public static void main(String[]args) {
		String text="omkar";
		
		System.out.println(text);
		System.out.println(text.length());
		
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.indexOf("omkar"));
		
// Concatenaion
		
		/*String Concatenation
		The + operator can be used between strings to combine them. This is called "concatenation"*/
		
		String text1="patil";
		System.out.println(text+" "+text1);
		
		//You can also use the concat() method to concatenate two strings:
		
		System.out.println(text.concat(" "+text1));
		
//Java Numbers and Strings
		/*WARNING!
		Java uses the + operator for both addition and concatenation.
		Numbers are added. Strings are concatenated.*/
		
		int x=2;
		int y=2;
		int z=x+y;
		System.out.println(z);	//Numbers are added
		
		String a="10";
		String b="20";
		int c=10;
		String d=a+b+c;
		System.out.println(d);  //Strings are concatenated
		
		String e=x+a;
		System.out.println(e);  //If you add a number and a string, the result will be a string concatenation
		
//Strings - Special Characters
		//The backslash (\) escape character turns special characters into string characters
		String txt="we are \"Genious\"";
		System.out.println(txt);
		String txt1="it\'s alright";
		System.out.println(txt1);
		String txt2="white\\black";
		System.out.println(txt2);
		String txt3="Firstname:\nLastname:";
		System.out.println(txt3);
	}
}
