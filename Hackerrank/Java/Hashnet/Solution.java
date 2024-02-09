import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<ArrayList<String>> set = new HashSet<ArrayList<String>>();
        for(int i=0;i<t;i++){
            // System.out.println(set.get(pair_left[i]));
            ArrayList<String> curr = new ArrayList<String>();
            curr.add(pair_left[i]);
            curr.add(pair_right[i]);
            if(!set.contains(curr)){
                set.add(curr);  
            }
            // System.out.println(set);
            System.out.println(set.size());
        }
//Write your code here

   }
}
