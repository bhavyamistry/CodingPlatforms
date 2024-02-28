class Solution {
    public String reverseVowels(String s) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Character> pos_char = new ArrayList<Character>();
        HashMap<Character,Integer> vowels = new HashMap<Character,Integer>();
        String op = "";
        vowels.put('a', 1);
        vowels.put('e', 1);
        vowels.put('i', 1);
        vowels.put('o', 1);
        vowels.put('u', 1);
        vowels.put('A', 1);
        vowels.put('E', 1);
        vowels.put('I', 1);
        vowels.put('O', 1);
        vowels.put('U', 1);
        for(int i=0;i<s.length();i++){
            if(vowels.get(s.charAt(i))!=null){
                pos.add(1);
                pos_char.add(s.charAt(i));
            }
            else{
                pos.add(0);
            }
        }
        int reverse = pos_char.size()-1;
        for(int i=0;i<pos.size();i++){
            if(pos.get(i)==1){
                op += pos_char.get(reverse);
                reverse--;
            }
            else{
                op += s.charAt(i);
            }
        }
        return op;
    }
}
