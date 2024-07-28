Case = []
for _ in range(4):
    Case.append(int(input()))
t = 0
for i in Case:
    t += i
print(f"{divmod(t, 60)[0]}\n{divmod(t, 60)[1]}")
