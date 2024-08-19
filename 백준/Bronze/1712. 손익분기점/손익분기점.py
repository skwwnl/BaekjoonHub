a, b, c = map(int, input().split())


answer = 1

if b > c:
    answer = -1
elif c-b == 0:
    answer = -1
else:
    answer = a//(c-b) + 1

print(answer)
