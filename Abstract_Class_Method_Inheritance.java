abstract class A{
  
    void fun()
    {
        System.out.println("Function of A class is called");
    }
}
class B extends A{
}
class abstract3{
    public static void main(String args[])
    {
        B d = new B();
        d.fun();
    }
}

