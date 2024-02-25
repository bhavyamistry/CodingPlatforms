import numpy

def arrays(arr):
    arr = numpy.array(arr,float)
    res = arr[::-1] 
    return res

arr = input().strip().split(' ')
result = arrays(arr)
print(result)
