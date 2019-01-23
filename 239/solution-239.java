/*
思路1：
  最朴素的思想，从nums的第一个元素开始，找三个中的最大值，放入result。最后输出。
  执行用时: 94 ms, 在Sliding Window Maximum的Java提交中击败了12.69% 的用户
  
思路2：
  使用双端队列qmax来解决。（队列，先进先出。最先进去的是队头，最后进去的是队尾）
  qmax的放入规则：遍历nums，对于nums[i]的放入过程是：
    1、若qmax为空，则直接将i加入qmax；
    2、若qmax不为空，记录当前qmax的队尾为j
      1）nums[j] > nums[i], 直接将i放入队尾；
      2）nums[j] <= nums[i], 将j弹出，再重复放入过程。
    总结一下思想就是，从队头到队尾一定是递减的，且qmax的size不能超过k。
    放入result的是nums[qmax的队头]，因为队头最大。
   
   qmax的弹出规则：
    qmax的队头 == i - w时，弹出队头。此时即队头所经过的遍历次数已经超过k次。
   
   执行用时: 23 ms, 在Sliding Window Maximum的Java提交中击败了64.50% 的用户
*/
public int[] getMaxValueInWindow1(int[] nums, int k){
        if(nums.length < k || k < 1 || nums.length < 1)
            return nums;

        int index = 0;
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length - k + 1; i++){
            int t = 0;
            int r = Integer.MIN_VALUE;
            while(t<k){
                if(nums[i+t] > r)
                    r = nums[i+t];
                t++;
            }
            result[index++] = r;
        }
        return result;
    }

public int[] getMaxValueInWindow2(int[] nums, int k){
        if(nums.length < k || k < 1 || nums.length < 1)
            return nums;

        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            while(!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[i])
                qmax.pollLast();
            qmax.addLast(i);
            if(qmax.peekFirst() == i - k)
                qmax.pollFirst();
            if(i >= k-1)
                result[index++] = nums[qmax.peekFirst()];
        }
        return result;
    }

    
