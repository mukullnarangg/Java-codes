abstract class A {
    final void fun()
    {
        System.out.println("A fun() called");
    }
}
class B extends A{
}
class abstract4 {
    public static void main(String args[]){
            B b = new B();
            b.fun();
        }
}
