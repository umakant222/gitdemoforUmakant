import java.util.*;

public class JavaBasics {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Hello World");
        System.out.print("The journey to product based company has started now!\n");
        System.out.print("Software Engineer \n  Umakant Bhosale \n");

        // Boiler plate code
    
        // Print a Pattern 

        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Variables in Java 

        int p = 10;
        int q = 5;
        System.out.println(p);
        System.out.println(q);
        String name = "Tony Stark";
        System.out.println(name);

        p = q;
        System.out.println(p);

        // Data Types in Java  :-  ( byte & short are not mostly used)

        byte b = 8;
        System.out.println(b);
        boolean var = false;
        System.out.println(var);
        char ch = 'A';
        short s = 240;
        int  a = 20;
        float f = 22.2f;
        long l = 12345;
        System.out.println(l);
        double d = 1234.673837;
        System.out.println(d);

        // Sum of a & b 

        int e = 10;
        int g = 120;
        int sum = e + g;
        System.out.println(sum);
    
        // Comments in Java :- Single line (//) & Multiline comment /*  */
        
        // Input in java : - 
        
        //String fullname = sc.nextLine();
        //System.out.println(fullname);

        /*
        int n = sc.nextInt();
        System.out.println(n);
        
        String address = sc.next();
        System.out.println(address);
        
        float price = sc.nextFloat();
        System.out.println(price);

        boolean bn = sc.nextBoolean();
        System.out.println(bn); 

        short sh = sc.nextShort();
        System.out.println(sh);

        long ln = sc.nextLong();
        System.out.println(ln);
        */
       
        // Sum of a & b :- using scanner class

        int x = sc.nextInt();
        int y = sc.nextInt();
        // int z = x+y; (sum)
        int z = x*y;
        System.out.println(z);

        // Area of circle :- 

        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area); 


        // Type Conversion (Widening ) :- byte -> short -> int -> float -> long -> double (All this only conversion is possible )

        int w = 12;         //int to float  possible
        float q = w;
        System.out.println(q); 

        // Type Casting (Explicit / narrowing ) :- 

        float a = 25.12f;       // float to int conversion is not possible but if u wan't to do forcefully then use type casting.
        int b = (int)a;
        System.out.println(b); 

        float fa = 99.999f;       // float to int conversion is  not possible but if u wan't to do forcefully then use type casting.
        int c = (int)fa;
        System.out.println(c); 


        char cha = 'a';
        int no = cha;
        System.out.println(no);

        /*  Type Promotion in Expressions :- byte , short , char - > can convert to int when we solve expresn. */

        char i = 'i'; // 105
        char j = 'j'; // 106
        System.out.println((int)(i));
        System.out.println((int)(j));
        System.out.println(j-i);     

        /*char k = j - i;
        System.out.println(k);  int to char conversion not possible */

        short s = 7;
        byte by = 5;
        char e ='e';

        byte bt = (byte)(s+by+e);

        //  System.out.println(bt);
        //  System.out.println((bt)); It will print o/p but will not make any sense.

        // 2nd rule of java e.g : If one operand  is long ,float or double -> double resp.

        int l = 12;
        float m = 20.25f;
        long ln = 25;
        double d = 30;

        double ans = l+m+ln+d;
        System.out.println(ans);
    }
    
}
