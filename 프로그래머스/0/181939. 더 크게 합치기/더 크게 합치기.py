def solution(a, b):
    c = str(a) + str(b)
    d = str(b) + str(a)
    if int(c) == int(d) : return int(c)
    return max(int(c), int(d))
    