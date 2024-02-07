import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            ArrayList<Integer> curr_arr = new ArrayList<>();
            for(int j=0;j<k;j++){
                curr_arr.add(sc.nextInt());
            }
            arr.add(curr_arr);
        }
        int q = sc.nextInt();
        int queries[][] = new int[q][2];
        for(int i=0;i<q;i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        for(int i=0;i<q;i++){
            try{
                ArrayList<Integer> curr_arr = arr.get(queries[i][0]-1);
                // System.out.println(curr_arr);
                System.out.println(curr_arr.get(queries[i][1]-1)); 
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
