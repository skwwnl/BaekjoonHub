def solution(s):
    list_letter = list(set(s))
    list_letter.sort()
    new_string = ""

    for i in list_letter:
        cnt = 0
        for j in s:
            if i == j:
                cnt += 1
        if cnt == 1:
            new_string += i
    return new_string