def calc_digits(n):
    digits = 1
    quo = n/10
    ans = n
    while ans>=10:
        ans = quo
        digits += 1
        quo /= 10
    return digits     
n = int(input())
sum = 0
multi = 10
for i in range(1,n+1):
    if(i==1):
        sum = i
    if(i%10==0):
        d = calc_digits(i)
        multi = 10**d
    if(i!=1):
        sum = sum*multi+i    
    
print(sum)
    
