interface Printable{
	void print();
}
interface Showable extends Printable{
	void show();
}
class TestInter5 implements Showable{
	public void print(){
	System.out.println("printable hai");
	}
	public void show(){
	System.out.println("Showable hai");
	}
	public static void main (String args[]){
	TestInter5 ob = new TestInter5();
	ob.print();
	ob.show();
	}
	}
