# 소문자 알파벳 리스트
lowercase = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
# 대문자 알파벳 리스트
uppercase = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

S = input()
result = []

for i in S:
    # 알파벳 확인
    if i in lowercase or i in uppercase:
        # 대문자인 경우
        if i in uppercase:
            if uppercase.index(i) + 13 >= len(uppercase):
                result.append(uppercase[uppercase.index(i) + 13 - len(uppercase)])
            else:
                result.append(uppercase[uppercase.index(i) + 13])
        # 소문자인 경우
        else:
            if lowercase.index(i) + 13 >= len(lowercase):
                result.append(lowercase[lowercase.index(i) + 13 - len(lowercase)])
            else:
                result.append(lowercase[lowercase.index(i) + 13])
    else:
        result.append(i)

print("".join(result))
