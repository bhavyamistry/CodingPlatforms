import numpy

matrix = list()
inp = input().split()
for i in range(int(inp[0])):
    row = input().split()
    matrix.append(row)
mat_array = numpy.array(matrix,int)
print(numpy.transpose(mat_array))
print(mat_array.flatten())


