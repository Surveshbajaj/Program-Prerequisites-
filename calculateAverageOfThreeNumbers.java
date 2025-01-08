import java.util.Scanner;

public class calculateAverageOfThreeNumbers{
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	int a = myObj.nextInt();
	int b = myObj.nextInt();
	int c = myObj.nextInt();
	double avg = (a+b+c)/3;
		
	System.out.print(avg);
	
		
}
}