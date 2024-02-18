if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    lst_x = list()
    lst_y = list()
    lst_z = list()
    for i in range(x+1):
        lst_x.append(i)
    for i in range(y+1):
        lst_y.append(i)
    for i in range(z+1):
        lst_z.append(i)
    final = list()
    for i in range(len(lst_x)):
        for j in range(len(lst_y)):
            for k in range(len(lst_z)):
                chk = lst_x[i]+lst_y[j]+lst_z[k]
                if chk!=n:
                    lst = list()
                    lst.append(lst_x[i])
                    lst.append(lst_y[j])
                    lst.append(lst_z[k])
                    final.append(lst)
    # print(lst_x)
    # print(lst_y)
    # print(lst_z)
    print(final)
