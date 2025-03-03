T = int(input())


def triangle(a, b, c):
    if a**2 + b**2 == c**2:
        return True
    elif a**2 + c**2 == b**2:
        return True
    elif b**2 + c**2 == a**2:
        return True
    else:
        return False


for i in range(1, T + 1):
    a, b, c = map(int, input().split())
    result = triangle(a, b, c)
    if result == True:
        print(f"Scenario #{i}:")
        print("yes\n")
    else:
        print(f"Scenario #{i}:")
        print("no\n")
