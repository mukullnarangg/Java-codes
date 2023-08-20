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
		super(a);
		c1=-1;
	}
	Box2(double a,double b){
		super(a,b);
		c1=-1;
	}
	Box2(double a,double b,double c){
		super(a,b);
		c1=c;
	}
	Box2(Box2 o){
		super(o);
		c1=o.c1;
	}
	double volume(){
		return a1*b1*c1;
	}
}
class Box3 extends Box2{
	double d1;
	Box3(double a){
		super(a);
		d1=-1;
	}
	Box3(double a,double b){
		super(a,b);
		d1=-1;
	}
	Box3(double a,double b,double c){
		super(a,b,c);
		d1=-1;
	}
	Box3(double a,double b,double c,double d){
		super(a,b,c);
		d1=d;
	}
	Box3(Box3 o){
		super(o);
		d1=o.d1;
	}
}

public class DemoBox2{
	public static void main(String[] args){
		Box3 mybox1 = new Box3(14);
		Box3 mybox2 = new Box3(2,12);
		Box3 mybox3 = new Box3(3,4,6);
		Box3 mybox4 = new Box3(3,4,6,8);
		Box3 mybox5 = new Box3(mybox1);
		double vol,area;
		vol= mybox1.volume();
		area=mybox1.area();
		System.out.println(vol);
		System.out.println(area);
		System.out.println(mybox1.d1);
		System.out.println();
		vol= mybox2.volume();
		area=mybox2.area();
		System.out.println(vol);
		System.out.println(area);
		System.out.println(mybox2.d1);
		System.out.println();
		vol= mybox3.volume();
		area=mybox3.area();
		System.out.println(vol);
		System.out.println(area);
		System.out.println(mybox3.d1);
		System.out.println();
		vol= mybox4.volume();
		area=mybox4.area();
		System.out.println(vol);
		System.out.println(area);
		System.out.println(mybox4.d1);
		System.out.println();
		vol= mybox5.volume();
		area=mybox5.area();
		System.out.println(vol);
		System.out.println(area);
		System.out.println(mybox5.d1);
		System.out.println();

	}
}
