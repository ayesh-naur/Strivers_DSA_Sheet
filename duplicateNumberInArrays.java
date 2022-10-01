class Solution {
    public int findDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>();
        Integer dup = 0;
        
        for(Integer val : list) {
            if(set.contains(val)){
                dup = val;
            }else{
                set.add(val);
            }
        }
        
        return dup;
    }
}
