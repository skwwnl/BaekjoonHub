def solution(numer1, denom1, numer2, denom2):
    answer = []
    up = numer1 * denom2 + denom1 * numer2
    down = denom1 * denom2
    gcd_num = gcd(up, down)
    answer.append(up//gcd_num)
    answer.append(down//gcd_num)
    return answer

def gcd(m,n): 
    if m < n:
        m, n = n, m
    if n == 0:
        return m
    return gcd(n, m % n)