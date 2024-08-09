Number = input()

phoneNumber = {
    1: "",
    2: [
        "A",
        "B",
        "C",
    ],
    3: ["D", "E", "F"],
    4: ["G", "H", "I"],
    5: ["J", "K", "L"],
    6: ["M", "N", "O"],
    7: ["P", "Q", "R", "S"],
    8: ["T", "U", "V"],
    9: ["W", "X", "Y", "Z"],
    0: [""],
}

result = 0

for i in Number:
    a = [key for key, val in phoneNumber.items() if i in val]
    if a[0] == 0:
        a[0] = 10
    result += a[0] + 1
print(result)
