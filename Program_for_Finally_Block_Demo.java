class Finally{
	static void procA()
	{
	try{
	System.out.println("inside proc()");
	throw new RuntimeException("Demo");
	}
	finally{
	System.out.println("Finally-procA()");
	}
	}
	static void procB()
{
	try{
	System.out.println("inside procB()");
	return;
	}
	finally{
	System.out.println("procB - Finally");
	}
}
public static void main(String args[]){
	try{
	procA();
	}catch(Exception e){
		System.out.println("Exception Caught");
	}
	procB();
}
}
