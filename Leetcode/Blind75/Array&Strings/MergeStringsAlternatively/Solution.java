class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max_length;
        if(word1.length()> word2.length()){
            max_length = word1.length();
        }
        else{
            max_length = word2.length();
        }
        String new_str = "";
        for(int i=0;i<max_length;i++){
            if(i<=(word1.length()-1)){
                new_str += word1.charAt(i);
            }
            if(i<=(word2.length()-1)){
                new_str += word2.charAt(i);
            }
        }
        return new_str;
    }
}
