import java.util.*;
class Birthday{
	int dd,mm,yy;

	Birthday(){
	dd=mm=yy=-1;
}
	Birthday(int dd,int mm, int yy){
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}
	void get(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the birth date: ");
	mm=sc.nextInt();
	System.out.print("Enter the birth month: ");
	dd=sc.nextInt();
	System.out.print("Enter the birth year: ");
	yy=sc.nextInt();
	System.out.println("The entered date of birth is: "+dd+" / "+mm+" / "+yy);
}
	void put(Birthday obj){
	System.out.println(obj.dd+" / "+obj.mm+" / "+obj.yy);
	}
}
	class Birth{
		public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Birthday obj1=new Birthday(3,1,2);
		Birthday obj2=new Birthday();
		int a;
		do{
			System.out.println("Choose an option\n1. Print recorded data\n2. Add new data\n3. Exit");
	a=sc.nextInt();
	switch(a){
	case 1: System.out.print("The date of birth is: ");
	obj1.put(obj1);
	break;
	case 2: obj2.get();
	break;
	case 3: System.out.print("Exiting...");
	break;
	default: System.out.println("Enter a valid value");
	}
}while(a!=3);

}
}
