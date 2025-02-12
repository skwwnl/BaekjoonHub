N, K = map(int, input().split())

students_men = [0 for _ in range(6)]
students_women = [0 for _ in range(6)]

for i in range(N):
    S, Y = map(int, input().split())
    if S == 0:
        students_women[Y - 1] += 1
    elif S == 1:
        students_men[Y - 1] += 1


# 계산
def calc(students):
    count = 0
    for i in range(len(students)):
        count += students[i] // 2
        if students[i] % 2 == 1:
            count += 1
    return count


result = calc(students_men) + calc(students_women)
print(result)
