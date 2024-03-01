class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptr_a = 0, ptr_b = 0;
        if(s.length()==0){
            return true;
        }
        while(ptr_b < t.length()){
            if(t.charAt(ptr_b)==s.charAt(ptr_a)){
                if(ptr_a==(s.length()-1)){
                    return true;
                }
                ptr_a++;
                ptr_b++;
            }
            else{
                ptr_b++;
            }
        }
        return false;
    }
}
