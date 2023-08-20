interface printable{
	void print();

	interface showable{
	void show();
	}
}
interface showable{
	void show();
}
class Drawable implements printable.showable{
	public void show(){
	System.out.println("Showable hai");
	} 
	public static void main(String args[]){
	Drawable ob = new Drawable();
	ob.show();
	}
}
