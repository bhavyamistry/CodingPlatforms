import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet a = new BitSet(n);
        BitSet b = new BitSet(n);
        sc.nextLine();
        for(int i=0;i<m;i++){
            String s2 = sc.nextLine();
            String s[] = s2.split(" ");
            // System.out.println(s2);
            if(s[0].matches("AND")){
                if(s[1].matches("1")){
                    // System.out.println("AND matches");
                    a.and(b);
                }
                else{
                    b.and(a);
                }
            }
            else if(s[0].matches("OR")){
                if(s[1].matches("1")){
                    a.or(b);
                }
                else{
                    b.or(a);
                }
            }
            else if(s[0].matches("XOR")){
                if(s[1].matches("1")){
                    a.xor(b);
                }
                else{
                    b.xor(a);
                }
            }
            else if(s[0].matches("SET")){
                if(s[1].matches("1")){
                    a.set(Integer.parseInt(s[2]));
                }
                else{
                    b.set(Integer.parseInt(s[2]));;
                }
            }
            else if(s[0].matches("FLIP")){
                if(s[1].matches("1")){
                    a.flip(Integer.parseInt(s[2]));
                }
                else{
                    b.flip(Integer.parseInt(s[2]));;
                }
            }
            // System.out.println("A:"+a);
            // System.out.println("B:"+b);
            System.out.println(a.cardinality()+" "+b.cardinality());   
        }       
    }
}
