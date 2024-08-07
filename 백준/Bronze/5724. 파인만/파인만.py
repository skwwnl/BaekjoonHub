while True:
    N = int(input())
    if N == 0:
        break

    total_square = 0
    for i in range(1, N + 1):
        total_square += i**2
    print(total_square)
