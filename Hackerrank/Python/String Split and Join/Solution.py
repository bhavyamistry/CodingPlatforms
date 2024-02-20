def split_and_join(line):
    lst = line.split(" ")
    line = "-".join(lst)
    return line
    

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
