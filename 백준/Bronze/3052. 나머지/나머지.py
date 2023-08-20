rest_list = list()

for _ in range(10):
    i = int(input())
    j = i % 42
    rest_list.append(j)

sum_list = set(rest_list)
print(len(sum_list))