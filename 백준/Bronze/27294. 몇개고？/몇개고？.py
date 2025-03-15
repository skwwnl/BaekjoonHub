T, S = map(int, input().split())

if S == 1:
    print(280)
else:
    if T >= 12 and T <= 16:
        print(320)
    else:
        print(280)