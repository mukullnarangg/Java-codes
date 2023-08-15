import java.util.*;
public class temp{
	public static void main(String[] args){
		System.out.println("Enter 1 if the temp is 0 and 25");
		System.out.println("Enter 2 if the temp is 26 and 52 ");
		System.out.println("Enter 3 if the temp is 53 and 84 ");
		System.out.println("Enter 4 if the temp is 85 and 120 ");
	Scanner num = new Scanner(System.in);
	System.out.println("Enter num");
	int i = num.nextInt();
	switch(i){
		case 1:
		System.out.println("temp is low");
		break;
		case 2:
		System.out.println("temp is moderate");
		break;
		case 3:
		System.out.println("temp is medium");
		break;
		case 4:
		System.out.println("temp is high");
		break;
		default:
		System.out.println("Entered wrong choice");
	}
}
}
