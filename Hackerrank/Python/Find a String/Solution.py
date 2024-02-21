def count_substring(string, sub_string):
    occur = 0
    for i in range(len(string)):
        if string[i]==sub_string[0]:
            # print("i=",i)
            # print("String match:",string[i])
            j = i+1
            comp = 1
            if (len(string)-i)>=len(sub_string):
                for l in range(1,len(sub_string)):
                    # print("l:",l," sub_string at l:",sub_string[l])
                    # print("j:",j," string at j:",string[j])
                    if sub_string[l] == string[j]:
                        comp += 1
                    # print("Comp=",comp)
                    if comp==len(sub_string):
                        occur += 1
                        # print("Occur:",occur)
                        break
                    j+=1
    return occur
