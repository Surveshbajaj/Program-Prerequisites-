import java.util.Scanner;

public class celsiusToFahrenheitConversion{
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	int Celsius = myObj.nextInt();
	float Fahrenheit = (Celsius * 9/5) + 32;
	System.out.print(Fahrenheit);
	
}
}