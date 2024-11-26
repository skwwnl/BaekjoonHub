alpa = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]


n = input()
cnt = 0
new = ""
for i in alpa:
    while True:
        if i in n:
            cnt += 1
            n = n.replace(str(i), "_", 1)
        else:
            break
n = n.replace("_", "")
print(cnt + len(n))
