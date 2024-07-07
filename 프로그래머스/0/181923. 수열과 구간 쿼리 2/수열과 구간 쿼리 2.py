def solution(arr, queries):
    answer = []
    
    for i in range(len(queries)):
        b = []
        for j in range(queries[i][0], queries[i][1] + 1):
            if queries[i][2] < arr[j]:
                b.append(arr[j])
        if len(b) == 0:
            b.append(-1)
        answer.append(min(b))
    
    return answer