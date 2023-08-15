class Box
{
	double width;
	double height;
	double depth;
}

class BoxDemo2
{
	public static void main(String args[]){
	Box myBox1 = new Box();
	Box myBox2 = new Box();
	double vol1;
	double vol2;

	myBox1.width=10;
	myBox1.height=30;
	myBox1.depth=15;

	myBox2.width=20;
	myBox2.height=12;
	myBox2.depth=14;

	vol1=myBox1.width*myBox1.height*myBox1.depth;
	vol2=myBox2.width*myBox2.height*myBox2.depth;

	System.out.print("The vol1 is :");
	System.out.println(vol1);

	System.out.print("The vol2 is :");
	System.out.print(vol2);

	}
}

