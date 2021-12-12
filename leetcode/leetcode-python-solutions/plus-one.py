def plus_one(digits):
    for i in range(len(digits)-1, -1, -1):
        if digits[i] != 9:
            digits[i] += 1
            return digits
        else:
            digits[i] = 0
    # edge case, if all digits are 9
    digits = [1] + digits
    print(digits)
    return digits


plus_one([9])
