M = int(input())
N = int(input())

result = []
for i in range(M, N + 1):
    T = int(i**0.5) ** 2
    if i == T:
        result.append(i)

if result:
    print(sum(result))
    print(min(result))
else:
    print(-1)
