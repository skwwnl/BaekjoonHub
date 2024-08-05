A, B, C = map(int, input().split())
l1 = [A, B, C]
l1.remove(max(l1))
l1.remove(min(l1))
print(l1[0])
