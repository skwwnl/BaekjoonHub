T = int(input())

for _ in range(T):
    sentence = list(input().split())
    reverse_sen = []
    for word in sentence:
        reverse_sen.append(word[::-1])
    print(" ".join(reverse_sen))
