T = int(input())

for _ in range(T):
    N, M = map(int, input().split())
    result = 0
    for i in range(N, M + 1):
        result += str(i).count("0")

    print(result)
