class ThrowsExecp {
 
    static void fun2() throws IllegalAccessException
    {
        System.out.println("Inside fun2(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try {
            fun2();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught.\n" +e);
        }
    }
}

