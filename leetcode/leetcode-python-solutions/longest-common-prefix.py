def longest_common_prefix(strs):
    if len(strs) == 0:
        return ""
    # sort array first
    strs.sort(key=len, reverse = False)
    print(strs)
    common_prefix = strs[0]
    for i in range(1, len(strs)):
        for j in range(len(common_prefix)):
            if strs[i][j] != common_prefix[j]:
                common_prefix = common_prefix[0:j]
                break
    print(common_prefix)
    return common_prefix


longest_common_prefix(['flower', 'flow', 'flight'])

