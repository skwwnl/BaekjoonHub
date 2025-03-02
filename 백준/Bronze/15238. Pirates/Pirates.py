N = int(input())
L = input()
W = L[0:N]

words = set(list(W))
max_num = 0
max_word = ""

for i in words:
    if W.count(i) > max_num:
        max_num = W.count(i)
        max_word = i
    else:
        continue

print(max_word, max_num)
