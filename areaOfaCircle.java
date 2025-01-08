import java.util.Scanner;

public class areaOfaCricle{
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	double radius = myObj.nextDouble();
	double area = 3.14 * radius*radius;
	System.out.print(area);
	
		
}
}