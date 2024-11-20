def solution(my_strings, parts):
    answer = ''
    
    for i in my_strings:
        a = my_strings.index(i)
        answer += i[parts[a][0]:parts[a][1]+1]
    return answer