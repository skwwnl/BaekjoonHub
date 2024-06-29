def solution(a, b):
    c = str(a) + str(b)
    if int(c) > 2*int(a)*int(b): return int(c)
    else : return 2*int(a)*int(b)
    return answer