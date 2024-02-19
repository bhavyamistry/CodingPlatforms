if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for i in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    if query_name in student_marks.keys():
        # print(student_marks[query_name])
        lst = student_marks[query_name]
        sum = 0
        for i in  range(len(lst)):
            sum += lst[i]
        print("%.2f" % round((sum/3),2))
