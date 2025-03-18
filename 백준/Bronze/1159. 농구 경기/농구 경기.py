T = int(input())

name_list = {}

for i in range(T):
    name = input()
    if name[0] in name_list:
        name_list[name[0]] += 1
    else:
        name_list[name[0]] = 1

result = ""
for k in sorted(name_list.keys()):  # 알파벳 순으로 정렬
    if name_list[k] >= 5:
        result += k

if result == "":
    print("PREDAJA")
else:
    print(result)
