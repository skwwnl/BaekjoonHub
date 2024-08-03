import math


N = int(input())
S = list(map(int, input().split()))
total = 0


def is_prime_number(number):
    for n in range(2, int(math.sqrt(number)) + 1):
        if number % n == 0:
            return False
    return True


for i in range(N):
    if S[i] == 1:
        continue
    if is_prime_number(S[i]) == True:
        total += 1

print(total)
