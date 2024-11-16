def solution(n):
    f_list = []
    answer = 0
    for i in range(1, 11):
        f_list.append(factorial(i))
    
    for j in f_list:
        if n > j or n == j:
            answer = f_list.index(j) + 1
        
    return answer

def factorial(a):
    if a == 1:
        return 1
    return a * factorial(a-1)