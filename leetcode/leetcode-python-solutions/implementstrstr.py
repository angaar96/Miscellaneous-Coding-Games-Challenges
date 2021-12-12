def str_str(haystack, needle):
    if needle == "":
        return 0
    for i in range(0, len(haystack)-len(needle)+1):
        for j in range(0, len(needle)):
            if needle[j] != haystack[i+j]:
                break
            if j == len(needle) - 1:
                return i
    return -1


