a, b, c = map(int, input().split())

num_list = [a, b, c]
a = sum(num_list) - max(num_list)

if max(num_list) >= a:
    print(a + (a - 1))
else:
    print(sum(num_list))
