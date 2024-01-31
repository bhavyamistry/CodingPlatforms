import java.io.*;
import java.util.*;

public class Solution {
    static int b , h;
    static {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
    }
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
        // System.out.println(b);
        // System.out.println(h);
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(b*h);        
        }
    }
}
