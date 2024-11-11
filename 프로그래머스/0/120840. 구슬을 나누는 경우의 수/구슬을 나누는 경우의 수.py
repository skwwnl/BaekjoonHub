def factorial(n):
    ret = 1
    for i in range(1, n+1):
        ret *= i
    return ret

def solution(balls, share):
    answer = 0
    
    answer = factorial(balls) / (factorial(balls-share) * factorial(share))
    
    return int(answer)