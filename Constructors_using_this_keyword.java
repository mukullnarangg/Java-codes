class Box{
    double width;
    double height;
    double depth;
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return height*width*depth;
    }
}
public class Box1{
    public static void main(String[] args){
        Box myBox1 = new Box(12,12,10);
        Box myBox2 = new Box(13,14,15);
        System.out.println("Vol is : " + myBox1.volume());
        System.out.println("Vol is : " + myBox2.volume());

    }
}
