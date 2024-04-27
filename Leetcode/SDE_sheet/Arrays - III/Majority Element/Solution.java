class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!dict.containsKey(nums[i])){
                dict.put(nums[i],1);
            }
            else{
                dict.put(nums[i],dict.get(nums[i])+1);
            }
        }
        for(Integer key: dict.keySet()){
            if(dict.get(key) > (nums.length/2)){
                return key;
            }
        }
        return 0;
    }
}
