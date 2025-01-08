import java.util.Scanner;

public class powerCalculation{
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	double a = myObj.nextInt();
	double b = myObj.nextInt();
		double power = Math.pow(a,b);
	System.out.print(power);
	
		
}
}