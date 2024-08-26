# 백준 1929번
import math

# M, N을 입력하시오
M, N = map(int, input().split())


# 소수 판별 함수 ()
def is_prime_number(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


# 소수 출력
for i in range(M, N + 1):
    if i == 1:
        continue
    elif is_prime_number(i) == True:
        print(i)
