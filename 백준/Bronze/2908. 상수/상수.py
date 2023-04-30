def select_Max(x, y):
    max = 0
    if x > y:
        max = x
    else:
        max = y
    return max

# 1번 map을 이용
a, b = map(int, input().split())

# 2번 list 이용
c = int(str(a)[::-1])
d = int(str(b)[::-1])

# 3번
print(select_Max(c, d))