class Solution {
    public int searchInsert(int [] nums, int target) {
        for (int i =0; i<nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                return i;
            }
        }
        for (int i=0; i<nums.length; i++) {
            if(nums[i]>target) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(nums.length);
        return nums.length;
    }
}