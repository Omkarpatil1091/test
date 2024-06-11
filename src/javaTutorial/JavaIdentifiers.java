package javaTutorial;

public class JavaIdentifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Names can contain letters, digits, underscores, and dollar signs
		Names must begin with a letter
		Names should start with a lowercase letter and it cannot contain whitespace
		Names can also begin with $ and _ (but we will not use it in this tutorial)
		Names are case sensitive ("myVar" and "myvar" are different variables)
		Reserved words (like Java keywords, such as int or boolean) cannot be used as names
		*/
		
		int minutes=60;
		// OK, but not so easy to understand what m actually is
		int m=60;
		
		System.out.println(minutes);
		System.out.println(m);
	}

}
