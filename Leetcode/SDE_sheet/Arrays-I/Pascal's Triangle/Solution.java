class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal_Triangle = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> inner_pascal = new ArrayList<Integer>();
            inner_pascal.add(1);
            if(pascal_Triangle.size()!=0){
            }
            if(pascal_Triangle.size()!=0){
                List<Integer> prev_array = pascal_Triangle.get(pascal_Triangle.size()-1);
                for(int k = 1;k<prev_array.size();k++){
                    inner_pascal.add(prev_array.get(k-1)+prev_array.get(k));
                }
                inner_pascal.add(1);
            }
            // System.out.println(inner_pascal);
            pascal_Triangle.add(inner_pascal);
          }
        return pascal_Triangle;
    } 
}
