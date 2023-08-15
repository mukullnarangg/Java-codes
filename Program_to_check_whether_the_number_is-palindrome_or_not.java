import java.util.*;
public class palindrome{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = input.nextInt();
	int r,s=0,temp;
	temp = num; 
	while(num>0){
	r=num%10;
	s=(s*10)+r;
	num=num/10;
}
	if(temp==s)
		{System.out.println("It is a palindrome");
	}
	else 
	System.out.println("Not a palindrome");
	}
	}
