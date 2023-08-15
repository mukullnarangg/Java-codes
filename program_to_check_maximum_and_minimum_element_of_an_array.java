import java.util.*;
public class minmax{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int i,min,max;
		System.out.print("Enter elements for the array: ");
		for(i=0;i<9;i++){
			arr[i]=sc.nextInt();
		}
		min=max=arr[0];
		for(i=0;i<9;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			else if(max<arr[i]){
				max=arr[i];
}
}
System.out.println("The maximum element of array is " +max);
System.out.println("The minimum element of array is " +min);
}
}
