N = int(input(""))

total_time = 1
answer = 0
for i in range(1, N + 1):
    total_time *= i

answer = total_time / (7 * 24 * 60 * 60)
print(int(answer))