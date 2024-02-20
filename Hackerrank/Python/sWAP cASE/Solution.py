def swap_case(s):
    frmt_str = ""
    for str in s:
        # print("Str:",str)
        if str.islower():
            frmt_str += str.upper()
        elif str.isupper():
            frmt_str += str.lower()
        else:
            frmt_str += str
        # print(frmt_str)
    return frmt_str

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
