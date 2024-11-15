def solution(n):
    answer = 0
    for j in range(4, n + 1):
        if divisor(j) == 1:
            answer += 1
    return answer

def divisor(b):
    a = 0
    for i in range(2, b + 1):
        if b % i == 0:
            a += 1
        if a > 1:
            return True
    return False