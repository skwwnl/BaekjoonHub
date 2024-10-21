def solution(slice, n):
    i = 1
    while True:
        if  i * slice >= n:
            return i
        i += 1