/**
耗时：25ms，击败了27.72% 的用户
思路1：
        利用set。遍历nums元素，若set中不含有该元素，则加入set；如含有，则有重复，返回true。
       
耗时：7 ms, 击败了83.93% 的用户
思路2：
        先排序。
        遍历数组，若nums[i]和nums[i+1]相等，则返回true。
        否则最后返回false。
**/
public boolean containsDuplicate1(int[] nums) {
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
public boolean containsDuplicate2(int[] nums){
        if(nums.length < 2)
            return false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
