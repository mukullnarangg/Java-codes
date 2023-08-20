import java.util.*;
abstract class demo{
	abstract void A();
}
class child extends demo{
	public void A(){
	System.out.println("Hello");
	}
}
public class boy1{
	public static void main(String args[]){
	child c = new child();
	c.A();
	}
}
