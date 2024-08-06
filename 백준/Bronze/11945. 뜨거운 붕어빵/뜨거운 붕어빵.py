N, M = map(int, input().split())
container = []

for i in range(N):
    container.append(input())

for i in container:
    print(i[::-1])
