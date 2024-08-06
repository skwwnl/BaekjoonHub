X = int(input())
N = int(input())
total_amount = 0

for i in range(N):
    a, b = map(int, input().split())
    total_amount += a * b

if total_amount == X:
    print("Yes")
else:
    print("No")
