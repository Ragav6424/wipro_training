Write a program that takes the row & columns input from the user to populate a 2D array and then prints the array.

import java.util.Scanner;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Write your code here
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}