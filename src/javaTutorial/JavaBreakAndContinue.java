package javaTutorial;

public class JavaBreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for (int i=0; i<10; i++) {
			if (i==4) {
				break;						//break
			}
			System.out.println(i);
		}
		for (int p=0; p<10; p++) {
			if (p==3) {
				continue;}					//continue						
			{
				System.out.println(p);
			}
		}*/
		
		/*int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }*/
		
		
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
		 	
		}
	}


