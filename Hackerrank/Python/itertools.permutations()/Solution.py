# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations
n = input().split()
lst = list(permutations(n[0],int(n[1])))
n_lst = list()
for i in range(len(lst)):
    str =  ''.join(lst[i])
    n_lst.append(str) 
n_lst.sort()
for i in range(len(n_lst)):
    print(n_lst[i])
