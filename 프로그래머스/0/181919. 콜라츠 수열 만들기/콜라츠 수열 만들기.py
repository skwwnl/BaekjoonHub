answer = []
def solution(n):
    if n == 1:
        answer.append(n)
        return answer

    if n % 2 == 0:
        answer.append(int(n))
        return solution(int(n / 2))
    else:
        answer.append(int(n))
        return solution(int(3 * n + 1))