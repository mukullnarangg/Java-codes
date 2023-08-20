interface drawable{
	void draw();
	default void print(){
	System.out.println("This is print method ");
	}
}
class printable3 implements drawable{
	public void draw(){
	System.out.println("draw method is called");
	}
	public static void main(String args[]){
	printable3 ob = new printable3();
	ob.draw();
	ob.print();
	}
}

