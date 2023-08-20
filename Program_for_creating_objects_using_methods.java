class Box{
	double width;
	double height;
	double depth;

	double volume(){
	return width*height*depth;
	}
}
class objdemo3{
	public static void main(String[] args){
		Box mybox1 = new Box();
		mybox1.width=10;
		mybox1.height=12;
		mybox1.depth=22;
		System.out.println("The volume1 is " +mybox1.volume());
		Box mybox2 = new Box();
		mybox2.width=12;
		mybox2.height=13;
		mybox2.depth=14;
		System.out.println("The volume2 is " +mybox2.volume());
			}
}
