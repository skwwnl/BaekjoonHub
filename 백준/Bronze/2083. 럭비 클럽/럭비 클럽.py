# Judgement Age and Weight
while True:
    a, b, c = input().split()
    if a + " " + b + " " + c == "# 0 0":
        break
    if int(b) > 17 or int(c) >= 80:
        print(a + " Senior")
    else:
        print(a + " Junior")
