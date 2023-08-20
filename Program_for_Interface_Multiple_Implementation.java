
interface drawable{
	void draw();
}
interface Testing{
	void draw();
}
class printable2 implements drawable,Testing{
	public void draw(){
	System.out.println("Drawable done!....");
	}
	public static void main(String args[]){
	printable2 ob = new printable2();
	ob.draw();
	}
} 
