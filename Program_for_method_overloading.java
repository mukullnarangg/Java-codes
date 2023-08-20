class methoverload{ 

	void test(){
	System.out.println("No parameters");
	}

	void test(int a){
	System.out.println("a: " +a);
}

	void test(int a,int b){
	System.out.println("a and b: " +a+ " " +b);
}
	double test(double a){
	System.out.println("double a: " +a);
	return a*a;
}
}

	class Overload{
		public static void main(String args[]){
		methoverload ob = new methoverload();
		double result;

		ob.test();
		ob.test(21);
		ob.test(20,21);
		result = ob.test(12.21);
		System.out.println("result of ob.test(12.21) is :" +result);
	}
}
