import java.util.*;
public class evenoddarr{
	public static void main(String[] args){
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int i,even=0,odd=0;
		System.out.print("Enter elements of the array: ");
		for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.print("Total even elements are "+even+"\nTotal odd elements are "+odd);
	}
}
