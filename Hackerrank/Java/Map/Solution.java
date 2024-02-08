import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String query = sc.next();
            int pos = sc.nextInt();
            // System.out.println(query);
            if(query.matches("Insert")){
                int val = sc.nextInt();
                arr.add(pos,val);
            }
            else{
                // System.out.println(pos);
                arr.remove(pos);
            }
        }
        for(int i=0;i<arr.size();i++){
          System.out.print(arr.get(i)+" ");  
        }
        
        
    }
}

