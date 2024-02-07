import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int max_sum = 0, curr_sum1 = 0, curr_sum2 = 0, curr_sum3 = 0, curr_sum = 0, flag = 0;
        for(int row=0;row<4;row++){
            List<Integer> curr_arr = arr.get(row);
            List<Integer> curr_arr2 = arr.get(row+1);
            List<Integer> curr_arr3 = arr.get(row+2);
            for(int cols=0;cols<4;cols++){
                curr_sum1 = ((curr_arr.get(cols)+curr_arr.get(cols+1))+curr_arr.get(cols+2));
                curr_sum2 = curr_sum1+curr_arr2.get(cols+1);
                curr_sum3 = ((curr_arr3.get(cols)+curr_arr3.get(cols+1))+curr_arr3.get(cols+2));
                curr_sum = curr_sum2 + curr_sum3;
                if(flag == 0){
                    max_sum = curr_sum;
                    flag = 1;
                }
                else{
                    if(curr_sum>max_sum){
                        max_sum = curr_sum;
                    }    
                }
                
            }
        }
        System.out.println(max_sum);
        bufferedReader.close();
    }
}
