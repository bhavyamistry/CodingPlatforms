if __name__ == '__main__':
    students = list()
    def myfunc(e):
        return e[1]
    def myfunc2(e):
        return e[0]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        lst = list()
        lst.append(name)
        lst.append(score)
        students.append(lst)
    students.sort(reverse=True,key=myfunc)
    # print(students)
    min = students[0]
    min_prev = students[0]
    for i in range(len(students)):
        if min[1] > students[i][1]:
            min_prev = min
            min = students[i]
    # print(min)
    # print(min_prev)
    index = list()
    for i in range(len(students)):
        if students[i][1]==min_prev[1]:
            index.append(students[i])
    index.sort(key=myfunc2)
    for i in range(len(index)): 
        print(index[i][0])
        
