a, b = map(int, input().split())
c = int(input())

if a + b >= c * 2:
    print(f"{a+b - c * 2}")
else:
    print(f"{a+b}")
