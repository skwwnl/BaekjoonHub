import math

M = int(input())
N = int(input())

num = []


def prime_number(N):
    for i in range(2, int(math.sqrt(N)) + 1):
        if N % i == 0:
            return False
    return True


for i in range(M, N + 1):
    if i == 1:
        continue
    if prime_number(i) == True:
        num.append(i)

if bool(num) == False:
    print(-1)
if bool(num) == True:
    print(sum(num))
    print(min(num))
