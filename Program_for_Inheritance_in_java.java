class Box{
	double a1;
	double b1;
	Box(){
		a1=b1=-1;
	}
	Box(double e){
	a1=e;
	b1=-1;
	}

	Box(double c, double d){
	a1=c;
	b1=d;
	}

	
	Box(Box ob){
	a1=ob.a1;
	b1=ob.b1;
	}

	double area(){
	return a1*b1;
	}
}
class Box2 extends Box{
	double c1;
	Box2(double a){
		a1=a;
		b1=c1=-1;
	}
	Box2(double a,double b){
		a1=a;
		b1=b;
		c1=-1;
	}
	Box2(double a,double b,double c){
		a1=a;
		b1=b;
		c1=c;
	}
	Box2(Box2 o){
		a1=o.a1;
		b1=o.b1;
		c1=o.c1;
	}
	double volume(){
		return a1*b1*c1;
	}
}

public class DemoBox{
	public static void main(String[] args){
		Box2 mybox1 = new Box2(1);
		Box2 mybox2 = new Box2(2,3);
		Box2 mybox3 = new Box2(2,3,4);
		Box2 mybox4 = new Box2(mybox1);j
		double vol,area;
		vol= mybox1.volume();
		area=mybox1.area();
		System.out.println(vol);
		System.out.println(area);
		vol= mybox2.volume();
		area=mybox2.area();
		System.out.println(vol);
		System.out.println(area);
		vol= mybox3.volume();
		area=mybox3.area();
		System.out.println(vol);
		System.out.println(area);
		vol= mybox4.volume();
		area=mybox4.area();
		System.out.println(vol);
		System.out.println(area);
	}
}
