import java.util.*;
abstract class A{
	abstract class B{
		abstract void demofun();
	}
}
class C extends A{
	class D extends B{
	void demofun(){
	System.out.println("Sahi hai bilkul");
	}
	}
}
public class boy{
	public static void main(String args[]){
	C outer = new C();
	C.D inner = outer.new D();
	inner.demofun();
	}
}
