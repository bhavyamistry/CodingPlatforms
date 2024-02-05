import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        String s_splits[] = s.split("[ !,?._'@]+");
        if(s == ""){
           System.out.println("0"); 
        }
        else{
            System.out.println(s_splits.length);
            for(int i=0;i<s_splits.length;i++){
                System.out.println(s_splits[i]);
            }        
        }
    }
}
