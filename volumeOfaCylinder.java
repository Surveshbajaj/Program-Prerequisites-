import java.util.Scanner;

public class volumeOfaCylinder {
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	double radius = myObj.nextDouble();
	double height = myObj.nextDouble();
	double volume = 3.14 * (radius*radius) * height;
	System.out.print(volume);
	
		
}
}