import java.util.*;
import java.math.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max_unique = 0;
        Deque deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if(map.get(num)== null){
                map.put(num,1);
            }
            else{
                int val = map.get(num);
                map.put(num, val+1);
            }
        
            if(deque.size()==m){
                max_unique = Math.max(max_unique, map.size());
            }
            if(i>=m-1){
                int removeF =(int)deque.removeFirst();
                map.put(removeF, map.get(removeF)-1);
                if(map.get(removeF)==0)
                        map.remove(removeF);
                
            }
        }
        System.out.println(max_unique);
        
    }
}
