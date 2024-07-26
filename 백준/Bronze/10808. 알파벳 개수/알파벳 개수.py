W = input()

alphabet_list = [
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "j",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "q",
    "r",
    "s",
    "t",
    "u",
    "v",
    "w",
    "x",
    "y",
    "z",
]
count_list = []
for _ in range(len(alphabet_list)):
    count_list.append(0)

for i in W:
    if i in alphabet_list:
        count_list[alphabet_list.index(i)] += 1

a = ""
for i in count_list:
    a += str(i) + " "
print(a)
