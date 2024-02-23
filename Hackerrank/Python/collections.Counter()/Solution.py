# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter
n = int(input())
lst = [int(x) for x in input().split()] 
size = list(Counter(lst).keys())
# print(size)
stk = list(Counter(lst).values())
# print(stk)
c = int(input())
ttl = 0
for i in range(c):
    sh = [int(x) for x in input().split()] 
    if sh[0] in size:
        ind = size.index(sh[0])
        if stk[ind]!=0:
            ttl += sh[1]
            stk[ind] -= 1
print(ttl)
