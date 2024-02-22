import textwrap

def wrap(string, max_width):
    str = ""
    rm_ind = len(string)
    for i in range(len(string)):
        # print("i:",(i+1))
        if (i+1)%max_width==0:
            str += string[((i+1)-max_width):(i+1)]+ '\n'
            rm_ind -= len(string[((i+1)-max_width):(i+1)])
            # print(str)
            # print("length:",len(string[((i+1)-max_width):(i+1)]))
        # print("rm_ind:",rm_ind)
        if rm_ind<max_width:
            # print("length:",len(string[(i+1):(len(string))]))
            str += string[(i+1):(len(string))]
            break
    return str

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
