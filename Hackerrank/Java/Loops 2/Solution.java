import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Integer> a_n = new ArrayList<Integer>();
        List<Integer> b_n = new ArrayList<Integer>();
        List<Integer> n_n = new ArrayList<Integer>(); 
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            a_n.add(a);
            int b = in.nextInt();
            b_n.add(b);
            int n = in.nextInt();
            n_n.add(n);
        }
        // System.out.println("A:"+a_n);
        // System.out.println("B:"+b_n);
        // System.out.println("N:"+n_n);
        for(int j=0;j<t;j++){
            int ans = a_n.get(j)+b_n.get(j);
            for(int i=1;i<=n_n.get(j);i++){                
                System.out.print(Integer.toString(ans)+" ");
                ans += Math.pow(2,i)*b_n.get(j);
            }
            System.out.println();
        }
        in.close();
    }
}
