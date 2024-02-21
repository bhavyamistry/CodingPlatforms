if __name__ == '__main__':
    s = input()
    alp = [0,0,0,0,0] 
    for i in s:
        if i.isalnum() and alp[0]==0:
            alp[0] = 1
        if i.isalpha() and alp[1]==0:
            alp[1] = 1
        if i.isdigit() and alp[2]==0:
            alp[2] = 1
        if i.islower() and alp[3]==0:
            alp[3] = 1
        if i.isupper() and alp[4]==0:
            alp[4] = 1
    for i in range(len(alp)):
        if alp[i]==1:
            print(True)
        else:
            print(False)
    
