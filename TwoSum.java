class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pos = new int[2];
        
        for(int i =0 ; i< nums.length ; i++){
             for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    pos[0] = i;
                    pos[1] = j;
                    break;
                 }
            }
            
           
        }
        
        return pos;
    }
}
