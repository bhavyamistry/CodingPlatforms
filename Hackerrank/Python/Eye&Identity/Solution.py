import numpy
numpy.set_printoptions(legacy='1.13')

n = input().split()

print(numpy.eye(int(n[0]), int(n[1]), k = 0))
