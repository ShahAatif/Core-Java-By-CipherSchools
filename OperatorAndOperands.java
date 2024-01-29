class Operators{
    public static void main(String[] args) {
        int x =5;
        int y=7;
        System.out.println("X is "+x);
        System.out.println("Y is "+y);

        byte b=10;
        System.out.println("B is"+b);

        byte b2=(byte)130;
        System.out.println("B2 is"+b2);

        int i=b;
        System.out.println("I is "+b);

        byte b4 = (byte) 256;
        float f = (float)5.5; //by default considers decimal to be double
        float f2 = 5.5f;
        double d = 10.5;
        char ch = 'a';
        System. out. println(ch);
        //  Task 1: Different ways to convert character to int
        int z=x+y;
        //+ -> Operator
        // x,y -> Operands

        // Increment and Decrement Operators
        int m=5;
        int n=m++;  //assign the value Of m to n then increase value Of m wherever it was defined
        System.out.println("M is "+m+"N is " +n);

        // Think of this as:
        // 1. P=P+1;
        // 2. int q=p;
        int p=5;
        int q=++p;
        System.out.println("P is "+p+"Q is "+q);

    }
}
