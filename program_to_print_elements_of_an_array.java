import java.util.*;
public class elements{
	public static void main(String[] args){
		Scanner noob = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int num = noob.nextInt();
	int[] arr = new int[num];
	System.out.println("Enter "+num+ " elements");

	for(int i = 0; i<arr.length;i++){
		arr[i] = noob.nextInt();
	}
		System.out.println("Element of array are");
		for(int i = 0;i<num;i++){
			System.out.println(arr[i]);
		}
	}
}
