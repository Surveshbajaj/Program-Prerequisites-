import java.util.Scanner;

public class calculateSimpleInterest  {
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	double principle = myObj.nextDouble();
	double rate = myObj.nextDouble();
	double time = myObj.nextDouble();
	double interest = (principle * rate * time) / 100;
	System.out.print(interest);
	
		
}
}