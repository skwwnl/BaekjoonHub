def solution(n):
    while True:
        cnt = 0
        cnt += n // 7
        if n % 7 == 0:
            return cnt
        if n % 7 < 7:
            return cnt + 1