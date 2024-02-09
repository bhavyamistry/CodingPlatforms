import java.io.*;
import java.util.*;

public class Solution {
    public static void printArray(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("Hello");
        stringArray.add("World");
        printArray(intArray);
        printArray(stringArray);
        
    }
}
