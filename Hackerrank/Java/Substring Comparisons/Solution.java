    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String curr = "";
        for(int i=1;i<=s.length()-k;i++){
            curr = s.substring(i,i+k);
            if(smallest.compareTo(curr) > 0){
                smallest = curr;
            }
            if(largest.compareTo(curr) < 0){
                largest = curr;
            }
        }
        return smallest + "\n" + largest;
    }

