def solution(quiz):
    answer = []
    
    for i in range(len(quiz)):
        new_quiz = quiz[i].split(" ")
        if new_quiz[1] == "+":
            if int(new_quiz[0]) + int(new_quiz[2]) == int(new_quiz[4]):
                answer.append("O")
            else:
                answer.append("X")
        elif new_quiz[1] == "-":
            if int(new_quiz[0]) - int(new_quiz[2]) == int(new_quiz[4]):
                answer.append("O")
            else:
                answer.append("X")
    return answer