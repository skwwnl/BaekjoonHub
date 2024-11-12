def solution(num_list, n):
    answer = []
    
    for i in range(len(num_list)//n):
        answer.append(num_list[0+i*n:n*(i+1)])
    return answer