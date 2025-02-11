N, M = map(int, input().split())

old_list = [x for x in range(1, N + 1)]
new_list = []

for _ in range(M):
    i, j = map(int, input().split())
    temp = old_list[i - 1 : j]
    temp.reverse()
    old_list[i - 1 : j] = temp

for i in range(N):
    print(old_list[i], end=" ")
