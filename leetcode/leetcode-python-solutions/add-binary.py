def add_binary(a, b):
    answerArr = []
    carry = 0
    if len(a) != len(b):
        longest_string = a if len(a) > len(b) else b
        if longest_string == a:
            b = "0"*(len(a)-len(b)) + b
        else:
            a = "0"*(len(b)-len(a)) + a
    print(a)
    print(b)
    for i in range(len(a)-1, -1, -1):
        if int(a[i]) + int(b[i]) == 2:
            if carry == 1:
                answerArr.insert(0, "1")
            else:
                carry = 1
                answerArr.insert(0, "0")
        elif int(a[i]) + int(b[i]) == 0:
            if carry == 1:
                answerArr.insert(0, "1")
                carry = 0
            else:
                answerArr.insert(0, "0")
        elif int(a[i]) + int(b[i]) == 1:
            if carry == 1:
                answerArr.insert(0, "0")
            else:
                answerArr.insert(0, "1")
        if i == 0 and carry == 1:
            answerArr.insert(0, "1")

    print(answerArr)
    print("".join(answerArr))
    return "".join(answerArr)


add_binary("1", "111")


