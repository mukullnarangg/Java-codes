class Box
{
	double width;
	double height;
	double depth;
}

class BoxDemo
{
	public static void main(String args[]){
	Box myBox = new Box();
	double vol;

	myBox.width=10;
	myBox.height=30;
	myBox.depth=15;

	vol=myBox.width*myBox.height*myBox.depth;

	System.out.print("The vol is :");
	System.out.print(vol);

	}
}
