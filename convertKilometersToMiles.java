import java.util.Scanner;



public class convertKilometersToMiles {
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	int kilometers = myObj.nextInt();
	
	double miles = kilometers * 0.621371;
		
	System.out.print(miles);
	
		
}
}
