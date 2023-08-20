class Box{
double i ;
}
class Box2 extends Box{
double i;
Box2(double a, double b){
	super.i=a;
	i=b;
	System.out.println("no of parent class" + super.i);
	System.out.println("no of sub class" + i);
}
}
public class DemoBox5{
	public static void main(String[] args){
		Box2 my = new Box2(2,3);
	}
}

