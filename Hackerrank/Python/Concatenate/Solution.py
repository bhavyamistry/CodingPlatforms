import numpy

inp = input().split()
matA = list()
matB = list()
for i in range(int(inp[0])):
    row = input().split()
    matA.append(row)
for j in range(int(inp[1])):
    row = input().split()
    matB.append(row)
matrixA = numpy.array(matA,int)
matrixB = numpy.array(matB,int)
print(numpy.concatenate((matrixA,matrixB),axis=0))
