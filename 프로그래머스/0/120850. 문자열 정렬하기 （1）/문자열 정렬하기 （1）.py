def solution(my_string):
    number = [str(i) for i in range(10)]
    answer = []
    
    for a in my_string:
        if a in number:
            answer.append(int(a))
    answer.sort()
    return answer