N = int(input())
M = int(input())

to_po = 0

a = N * 50
b = M * 10

if N > M:
    to_po = a - b + 500
else:
    to_po = a - b
print(to_po)
