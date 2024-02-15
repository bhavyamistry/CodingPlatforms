import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
// import 
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(sc.next().getBytes());  
            //converting byte array into signum representation  
            BigInteger no = new BigInteger(1, messageDigest);  
            //converting message digest into hex value  
            String hashtext = no.toString(16);
            System.out.println(hashtext);      
        }
        catch(NoSuchAlgorithmException n){
            System.out.println("No algorithm");
        }
        
    }
}
