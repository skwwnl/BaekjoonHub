import sys

while True:
    N = list(map(int, sys.stdin.readline().split()))
    if N[0] == 0:
        break

    max_num = max(N)
    N.remove(max_num)
    if N[0] ** 2 + N[1] ** 2 == max_num**2:
        print("right")
    else:
        print("wrong")
