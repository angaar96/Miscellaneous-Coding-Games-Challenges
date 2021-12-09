def remove_duplicates(nums):
    index = 0
    for i in range(0,len(nums)-1):
        if nums[i] != nums[i+1]:
            index += 1
            nums[index] = nums[i+1]
    print(nums)
    return index + 1

remove_duplicates([1,1,2])