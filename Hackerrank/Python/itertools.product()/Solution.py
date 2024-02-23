# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import product
A = [int(A) for A in input().split()]
B = [int(B) for B in input().split()]
s = ''
lst = list(product(A,B))
# for i in range(len(lst)):
print(*lst, end=' ')
# s = s.join(lst)
print(s)
