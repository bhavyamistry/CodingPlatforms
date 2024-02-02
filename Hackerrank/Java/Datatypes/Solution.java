import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr_input[] = new String[n];
        for(int i=0;i<n;i++){
            arr_input[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {            
            boolean fit = false;
            try{
                long l = Long.parseLong(arr_input[i]);
                System.out.println(arr_input[i]+" can be fitted in:");
                fit = true;
            }
            catch(Exception e){
                System.out.println(arr_input[i]+" can't be fitted anywhere.");
            }
            if(fit){
                try{
                    byte b = Byte.parseByte(arr_input[i]);
                    System.out.println("* byte");
                }
                catch(Exception e){
                    System.out.print("");
                }
                try{
                    short s = Short.parseShort(arr_input[i]);                
                    System.out.println("* short");
                    
                }
                catch(Exception e){
                    System.out.print("");
                }
                try{
                    int it = Integer.parseInt(arr_input[i]);
                    System.out.println("* int");
                }
                catch(Exception e){
                    System.out.print("");
                }
                System.out.println("* long");
            }
              
        }
    }
}
