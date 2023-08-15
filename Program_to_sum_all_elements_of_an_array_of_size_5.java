
import java.util.*;
public class sumalt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter elements of array: ");
		int i,sum=0,sum1=0,sum2=0;
		for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		} 
		for(i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		for(i=0;i<arr.length;i=i+2){
			sum1=sum1+arr[i];
		}
		for(i=1;i<arr.length;i=i+2){
			sum2=sum2+arr[i];
		}
		System.out.println("The sum of all elements is "+sum);
		System.out.println("The sum of alternate elements from 0 is "+sum1);
		System.out.println("The sum of alternate elements from 1 is "+sum2);
	}
}
