C, K, P = map(int, (input("").split(" ")))

total_wine = 0

for i in range(1, C + 1):
    if i == C:
        total_wine += K * C + P * (C**2)
        break
    total_wine += K * i + P * (i**2)

print(total_wine)