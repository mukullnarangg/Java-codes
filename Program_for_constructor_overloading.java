class Box{
	double width;
	double height;
	double depth;

	Box(double w,double h,double d){
	width = w;
	height = h;
	depth = d;
	}

	Box(){
	width = 2;
	height = 2;
	depth = 2;
	}

	Box(double len){
	width = height = depth = len;
	}
	double volume(){
	return width*height*depth;
	}
}

class consoverload{
	public static void main(String args[]){
	Box mybox1 = new Box(11,12,13);
	Box mybox2 = new Box();
	Box mybox3 = new Box(3);
	double vol;
	vol=mybox1.volume();
	System.out.println("Vol is " +vol);
	vol=mybox3.volume();
	System.out.println("Vol is " +vol);
	vol=mybox3.volume();
	System.out.println("Vol is " +vol);
