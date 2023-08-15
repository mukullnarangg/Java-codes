import java.util.*;
public class average{
	public static void main(String[] args){
		double[] arr = {1.1,2.1,3.1,4.1,5.1,6};
		double total = 0.00;
		for(int i=0;i<arr.length;i++){
			total = total + arr[i];
		}
		double average = total/arr.length;
		System.out.println(average);
	}
}
