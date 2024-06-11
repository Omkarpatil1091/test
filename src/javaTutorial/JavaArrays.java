package javaTutorial;

public class JavaArrays {

	public static void array(){
		String [] cars={"BMW","THAR","RUBICON","JEEP"};
		cars[3]="RANGEROVER";
		System.out.println(cars[3]);
		System.out.println(cars.length);
	}

	public static void main (String[]args) {
		//array();
		//JavaArrays.array();
		String[] vehicle= {"splendor","unicorn","bullet"};
		for (int i=0; i < vehicle.length; i++) {
			System.out.println(vehicle[i]);
		}
		//for (String i : vehicle) {
			//System.out.println(i);
		//}
		
	}
}
