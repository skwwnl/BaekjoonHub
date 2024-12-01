def solution(my_string):
    answer = int(my_string.split(" ")[0])

    for i in range(len(my_string.split(" "))):
        if my_string.split(" ")[i] == "+":
            answer += int(my_string.split(" ")[i + 1])
        elif my_string.split(" ")[i] == "-":
            answer -= int(my_string.split(" ")[i + 1])
    return answer