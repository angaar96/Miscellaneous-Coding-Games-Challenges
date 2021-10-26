import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

l, r = [int(i) for i in input().split()]

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)

def func_luck(l,r):
    lucky_numbers = []
    number = l
    #range constraints on lucky number as defined in problem
    while number <= r and number >= 1:
        if number>10**18:
            break
        # making sure numbers with both 6 and 8 arent counted (not lucky)
        if "6" in str(number) and "8" in str(number):
            number +=1
            continue
        #this will identify and store our lucky numbers
        if "6" in str(number) or "8" in str(number):
            lucky_numbers.append(str(number))
        number += 1
        #this print statement prints out the number of lucky numbers in the list
    print(len(lucky_numbers))

# summon function
func_luck(l,r)
