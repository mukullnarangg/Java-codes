abstract class parent{
	static void demofun(){
		System.out.println("fun method is called");
	}
}
public class child extends parent{
	public static void main(String args[]){
		child.demofun();
	}
}
