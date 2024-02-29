class Solution {
    public int compress(char[] chars) {
        int occurence = 0;
        int length = 0;
        char curr = chars[0];
        boolean first_char = true;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==curr){
                occurence++;
            }
            if(chars[i]!=curr){
                chars[length] = curr;
                length++;
                if(occurence>1){
                    String str = String.valueOf(occurence);
                   for(int j=0;j<str.length();j++){
                       chars[length] = str.charAt(j);
                       length++;
                   }
                }
                curr = chars[i];
                occurence = 1;
            }
            if(i==(chars.length-1)){
                chars[length] = curr;
                length++;
                if(occurence>1){
                    String str = String.valueOf(occurence);
                   for(int j=0;j<str.length();j++){
                       chars[length] = str.charAt(j);
                       length++;
                   }
                }
            }
        }
        return length;
    }
}
