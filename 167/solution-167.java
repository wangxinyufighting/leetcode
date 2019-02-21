class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];
        while(begin < end){
            int sum = numbers[begin] + numbers[end];
            if(sum == target){
                result[0] = begin+1;
                result[1] = end+1; 
                break;
            }
            else{
                if(sum > target)
                    end--;
                else
                    begin++;
            }
        }
        return result;
    }
}
