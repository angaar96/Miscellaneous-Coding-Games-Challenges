import sys
import math


def the_fastest(t):
    #initialize variables
    times_without_colon = []
    sum_times = []
    # remove colons from times 
    for j in t:
        times_without_colon.append(j.split(":"))
    for x in range(len(times_without_colon)):
        for i in range(len(times_without_colon[x])):
            times_without_colon[x][i] = int(times_without_colon[x][i])
            # convert all times to minutes
        sum_times.append(int(times_without_colon[x][0] * 60 + times_without_colon[x][1] + 
times_without_colon[x][2] / 60))
    # identify the fastest total time using min 
    quickest_runner_time = min(sum_times)
    # correlate this total time with the original time input by index searching
    n_value = sum_times.index(quickest_runner_time)
    print(t[n_value])
# take inputs from user 
n = int(input())
pull_times = []
# make sure there are n inputs, stored in pull_times, accessed in the_fastest function 
for i in range(n):
    t = input()
    pull_times.append(t)

the_fastest(pull_times)
