A, B, C = map(int, input("").split(" "))

a = []
for i in A, B, C:
    a.append(i)
b = sorted(a)
print(b[0], b[1], b[2])
