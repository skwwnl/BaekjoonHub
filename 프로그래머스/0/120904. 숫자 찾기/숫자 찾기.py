def solution(num, k):
    answer = 0
    string_num = list(str(num))
    
    for i in range(len(str(num))):
        if string_num[i] == str(k):
            answer = i + 1
            break
    if answer == 0:
        answer = -1
    return int(answer)