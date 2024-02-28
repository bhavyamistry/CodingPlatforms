class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        ArrayList<String> arr = new ArrayList<String>();
        String curr = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(curr != ""){
                    arr.add(curr);
                    curr = "";
                }
            }
            else if(i==(s.length()-1)){
                curr += s.charAt(i);
                arr.add(curr);
            }
            else{
                curr += s.charAt(i);
            }
        }
        System.out.println(arr);
        String output = "";
        for(int i=(arr.size()-1);i>=0;i--){
            output += arr.get(i);
            if(i!=0){
                output += " ";
            }
        }
        return output;
    }
}
