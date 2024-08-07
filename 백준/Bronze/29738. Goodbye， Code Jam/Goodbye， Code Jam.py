T = int(input())

for i in range(T):
    a = int(input())
    print(f"Case #{i+1}: ", end="")
    if a > 4500:
        print(f"Round 1")
    elif a > 1000:
        print(f"Round 2")
    elif a > 25:
        print(f"Round 3")
    else:
        print("World Finals")
