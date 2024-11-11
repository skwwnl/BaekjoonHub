def solution(emergency):
    answer1 = []
    answer2 = []
    
    answer1 = sorted(emergency, reverse=True)
    
    for i in emergency:
        answer2.append(answer1.index(i) + 1)
    return answer2