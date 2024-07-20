H, M = map(int, input("").split(" "))
total = 0

if H > 9:
    total += (H - 9) * 60

total += M
print(total)