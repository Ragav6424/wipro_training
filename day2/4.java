You are given a string s. In one move you can change any character to another character.

You have to make a string which consists of the same character. Find the minimum move to do this task

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int fre[]=new int[256];
        for(char ch:s.toCharArray())
        {
            fre[ch]++;
        }
        int max=0;
        for(int count:fre)
        {
            if(count>max)
            {
                max=count;
            }
        }
        int min=s.length()-max;
        System.out.println(min);
    }
}