import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> eof = new ArrayList<>();
        while(sc.hasNext()){
            eof.add(sc.nextLine());
        }
        for(int i =0;i<eof.size();i++){
            System.out.println((i+1)+" "+eof.get(i));
        }   
    }
}
