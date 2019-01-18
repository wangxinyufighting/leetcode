/**
ss
ss
ss

**/
public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2)
            return false;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
}
public boolean containsDuplicate1(int[] nums){
        if(nums.length < 2)
            return false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
