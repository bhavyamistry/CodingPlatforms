if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    # print(arr)
    max = arr[0]
    max_prev = arr[0]
    for i in range(len(arr)):
        if max < arr[i]:
            max_prev = max
            max = arr[i]
        # print("MAX:",max)
        # print("MAX_P:",max_prev)
    print(max_prev)
                
