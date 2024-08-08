n = int(input())

for i in range(n):
    p, n = map(int, input().split())
    print(f"{p + n//4 - n//7}")
