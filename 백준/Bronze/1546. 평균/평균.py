a = input()
b = input().split()

c = list()
for i in b:
    c.append(int(i))

maxNum = max(c)
result = 0
for i in c:
    result += i/maxNum * 100

print(result/int(a))