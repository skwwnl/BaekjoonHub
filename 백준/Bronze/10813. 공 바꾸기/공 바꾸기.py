N, M = map(int, input().split())

list = [i for i in range(1, N+1)]


for _ in range(M):
    i, j = map(int, input().split())
    list[i-1], list[j-1] = list[j-1], list[i-1]

print(*list, sep=" ")
