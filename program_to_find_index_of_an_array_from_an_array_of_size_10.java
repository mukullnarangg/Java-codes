import java.util.*;
public class index{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{3,5,7,9,10};
		int i,j;
		for (i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.print("Choose a element from above list: ");
		j=sc.nextInt();
		for (i=0;i<arr.length;i++){
			if(j==arr[i]){
				break;
			}
		}
		System.out.print("The index of "+j+" in the array is "+i);
	}
}
