a = 2
while True:
    N = input()
    if N == "Was it a cat I saw?":
        break

    b = ""
    for i in range(0, len(N), a):
        b += N[i]

    print(b)
    a += 1
