if __name__ == '__main__':
    N = int(input())
    stack = list()
    for i in range(N):
        inp = input().split()
        if inp[0]=="insert":
            # print("Insert")
            stack.insert(int(inp[1]),int(inp[2]))
        elif inp[0]=="append":
            # print("Append")
            stack.append(int(inp[1]))
        elif inp[0]=="remove":
            # print("Remove")
            stack.remove(int(inp[1]))
        elif inp[0]=="sort":
            # print("Sort")
            stack.sort()
        elif inp[0]=="reverse":
            # print("Reverse")
            stack.reverse()
        elif inp[0]=="pop":
            # print("POP")
            stack.pop()
        elif inp[0]=="print":
            # print("PRINT")
            print(stack)
        # print("Stack:",stack)
