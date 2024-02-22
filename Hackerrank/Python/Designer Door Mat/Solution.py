# Enter your code here. Read input from STDIN. Print output to STDOUT
p = input().split()
n = int(p[0])
m = int(p[1])
s = 'WELCOME'
pt= '.|.'
k = 1
for i in range(int(n/2)):
    print('-' * int((m-3*k)/2)+(pt*k)+'-' * int((m-3*k)/2))
    k += 2
print('-' * int((m-len(s))/2)+s+'-' * int((m-len(s))/2))
k -= 2
for i in range(int(n/2),0,-1):
    print('-' * int((m-3*k)/2)+(pt*k)+'-' * int((m-3*k)/2))
    k -= 2
