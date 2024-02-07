import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(j==i){
                    sum = arr[j];
                }
                else{
                    sum += arr[j];
                }
                if(sum < 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        
    }
}
