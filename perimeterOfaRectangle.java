import java.util.Scanner;

public class perimeterOfaRectangle   {
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	int length = myObj.nextInt();
	int width = myObj.nextInt();
		int perimeter = 2 * (length + width);
	System.out.print(perimeter);
	
		
}
}