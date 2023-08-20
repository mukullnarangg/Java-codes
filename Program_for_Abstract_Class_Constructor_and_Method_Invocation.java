abstract class A{
	A(){
	System.out.println("A constructor is called");
	}
	abstract void print();
}
class B extends A
{
	B(){
	System.out.println("B constructor is called");
	}
	void print(){
	System.out.println("B print() is called");
	}
}
public class abstract2{
	public static void main(String args[]){
	A ob = new B();
	ob.print();
	}
}
