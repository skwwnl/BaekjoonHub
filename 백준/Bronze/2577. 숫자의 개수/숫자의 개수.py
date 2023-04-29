A = int(input())
B = int(input())
C = int(input())

mul = A * B * C

a = []
b = []

for i in range(1, 11):
    b.append(0)

for i in str(mul):
    a.append(int(i))
    for j in range(len(b)):
        if j == int(i):
            b[j] += 1

for k in b[:]:
    print(k)