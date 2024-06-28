def solution(n):
    a = b = 0
    
    if n%2 == 1:
        for i in range(1, n+1, 2):
            a += i
        return a

    for i in range(2, n+1, 2): 
        b += i**2
    return b