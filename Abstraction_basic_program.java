abstract class A{
	abstract void printinfo();
}
class B extends A{
	void printinfo(){
	String name = "Niraj";
	int age =10;
	double salary = 10000.0;

	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);

	}
}

public class abstractttt{
	public static void main(String args[]){
	A ob = new B();
	ob.printinfo();
	}
}
