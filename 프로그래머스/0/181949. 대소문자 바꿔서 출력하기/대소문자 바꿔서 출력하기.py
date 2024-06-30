str = input()
a = ""
for i in str:
    if i.isupper():
        a += i.lower()
    if i.islower():
        a += i.upper()
print(a)