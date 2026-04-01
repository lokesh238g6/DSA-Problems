import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum=0;
        long windowSum=0;
        int left=0;
        HashSet<Integer> set=new HashSet<>();
        for (int right=0;right<nums.length;right++) {
            while (set.contains(nums[right])) {
                windowSum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            windowSum+=nums[right];
            if (right-left+1>k) {
                windowSum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            if (right-left+1==k) {
                maxSum=Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}