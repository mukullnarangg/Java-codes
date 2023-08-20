interface drawable{
	void draw();
	static int square(int x){
	return x*x;
	}
}
class printable implements drawable{
	public void draw(){
	System.out.println("hdeh");
	}
	public static void main(String args[]){
	printable ob = new printable();
	ob.draw();
	System.out.println(drawable.square(2));
	}
}
