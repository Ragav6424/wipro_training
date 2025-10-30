Create one default constructor to initialize the fields as default values to calculate volume of the cube and one parameterized constructor to pass parameters and initialize them accordingly. You can pass 3 integer parameters at runtime 
(While using parameterized constructor, the program, should also display the output with the default constructor also)

import java.util.*;
public class Main {
    static class Constructor
    {
        int l,b,h;
        double vol;
        Constructor()
        {
            System.out.println("Constructor without parameter");
            l=10;
            b=10;
            h=10;
            vol=l*b*h;
            System.out.println("Volume is "+vol);
        }
        Constructor(int l, int b, int h) {
        this();
        System.out.println("Constructor with parameter");
        l = l;
        b = b;
        h = h;
        vol = l* b * h;
        System.out.println("Volume is " + vol);
    }
    }
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int b=s.nextInt();
    int h=s.nextInt();
	Constructor cuboid2 = new Constructor(l,b,h);
    
    }
}