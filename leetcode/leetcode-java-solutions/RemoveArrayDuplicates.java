package com.company;

public class RemoveArrayDuplicates {
    public int removeArrayDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                index++;
                nums[index] = nums[i + 1];
            }
        }
        System.out.println(nums);
        return index+1;
    }
}
