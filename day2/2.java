Write a function to reverse each word in a string.

Description :- A method has to be created that takes a string as input and extracts each word from that string and then reverse each word individually and gives the output as a reversed string. 
public class Main {

    public static void main(String[] args) {
        String str="Great Learning";
        String arr[]=str.split(" ");
        StringBuilder res=new StringBuilder();
        for(String s:arr)
        {
            StringBuilder w=new StringBuilder(s);
            w.reverse();
            res.append(w);
            res.append(" ");
        }
        //write your answer here
        System.out.print(res);
    }
}