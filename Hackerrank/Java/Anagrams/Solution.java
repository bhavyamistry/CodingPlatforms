import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char a_arr[] = a.toLowerCase().toCharArray();
        Arrays.sort(a_arr);        
        char b_arr[] = b.toLowerCase().toCharArray();
        Arrays.sort(b_arr);
        String A = new String(a_arr);
        String B = new String(b_arr);
        // System.out.println(A);
        // System.out.println(B);
        // System.out.println(A.compareTo(B));
        if(A.compareTo(B) == 0){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
