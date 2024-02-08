import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        // System.out.println(game);
        // System.out.println(leap);
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i=0;i<game.length;i++){
            arr.add(false);
        }
        for(int i=game.length-1;i>=0;i--){
            if(game[i]==0){
                if((i+leap) >= game.length || (i+1) >= game.length){
                    arr.set(i, true);
                }
                else if((i+leap) < game.length){
                    if(arr.get(i+leap)){
                        arr.set(i, true);
                    }
                    else if(game[i+leap]==0){
                        int curr = i+leap;
                        while(curr>i){
                            if(game[curr]!=0){
                                break;
                            }
                            if(arr.get(curr)){
                                arr.set(i, true);
                                break;
                            }
                            curr--;
                        }
                    }
                    if(arr.get(i+1)){
                        arr.set(i, true);
                    }
                }
                else{
                    if((i+1)<game.length){
                        if(arr.get(i+1)){
                            arr.set(i, true);
                        }
                    }
                }                
            }
        }
        // System.out.println(arr);
        return arr.get(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
