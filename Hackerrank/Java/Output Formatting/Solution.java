import java.util.Scanner;
import java.lang.String;
public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String num = "";
                if(x<100){
                    if(x<10)
                        num = "00"+x;
                    else
                        num = "0"+x;                        
                }
                else
                    num += x;
                
                System.out.printf("%-15s",s1);
                System.out.printf("%s %n",num);
                //Complete this line
            }
            System.out.println("================================");

    }
}
