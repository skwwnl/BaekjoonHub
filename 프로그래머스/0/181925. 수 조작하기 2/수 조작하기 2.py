def solution(numlog):
    answer = ""
    for n in range(1, len(numlog)):
        if numlog[n-1] + 1 == numlog[n]: answer += "w"
        elif numlog[n-1] - 1 == numlog[n]: answer += "s"
        elif numlog[n-1] + 10 == numlog[n]: answer += "d"
        elif numlog[n-1] - 10 == numlog[n]: answer += "a"
    return answer