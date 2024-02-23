#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    ls = s.split()
    lis_s = list(s)
    for i in range(len(lis_s)):
        # print("char at:",lis_s[i])
        if i==0 and lis_s[i]!=' ':
            lis_s[i] = lis_s[i].upper()
        elif i!=0 and lis_s[i-1]==' 'and lis_s[i]!=' ':
            lis_s[i] = lis_s[i].upper()
        # print(lis_s)
    s = ""
    s = s.join(lis_s)
    # print(s)
    
    return s
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
