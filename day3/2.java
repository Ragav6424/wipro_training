Sum of All Numbers
Find the sum of the digits using recursion

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Math.abs(sc.nextInt());

        int sum=sumof(num);
        System.out.println(sum);
    }
    public static int sumof(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+sumof(n/10);
    }
}