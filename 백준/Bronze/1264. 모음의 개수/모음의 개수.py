m = ["a", "e", "i", "o", "u"]
while True:
    i = 0
    N = input()
    if N == "#":
        break
    for a in N.lower():
        if a in m:
            i += 1
    print(i)
