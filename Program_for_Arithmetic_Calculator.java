package calculator;
import java.util.*;
class AirthmaticCalculator{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Would you like to proceed? Enter 1 for yes and 2 for No");
		int choice =ob.nextInt();
		switch(choice){
			case 1:
			System.out.println("Enter 2 nos");
			int num1 = ob.nextInt();
			int num2 = ob.nextInt();

			int sum,diff,prod,div;

			sum=num1+num2;
			diff=num1-num2;
			prod=num1+num2;
			div=num1/num2;

			System.out.println("The sum is" +sum);
			System.out.println("The  diff is" +diff);
			System.out.println("The  prod is" +prod);
			System.out.println("The  div is" +div);
			break;

			default:
			System.out.println("Invalid choice");
			break;

 			}
	}
	
}
