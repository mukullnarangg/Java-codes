import java.util.*;
public class armstrong{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = input.nextInt();
	int r,s=0,temp;
	temp = num; 
	while(num>0){
	r=num%10;
	s=s+r*r*r;
	num=num/10;
	}
	if(temp==s)
		{System.out.println("It is a armstrong");
	}
	else 
	System.out.println("Not a armstrong");
	}
	}
