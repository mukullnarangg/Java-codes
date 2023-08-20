interface Printable{
void print();
}
interface Showable{
	void show();
}
	class Apac implements Printable,Showable{
	public void print(){
	System.out.println("Hello");
}
	public void show(){
	System.out.println("World");
}
	public static void main(String args[]){
	Apac ob = new Apac();
	ob.print();
	ob.show();
	}
	}
