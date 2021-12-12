def search_insert_position(nums, target):
    if target in nums:
        return nums.index(target)
    for i in range(0, len(nums)):
        if nums[i] > target:
            print(i)
            return i
    # if you cant find it, it must be at the end
    print(nums.length)
    return nums.length

