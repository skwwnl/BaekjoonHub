n = int(input())  # 분해합을 입력값으로 받음

for i in range(1, n + 1):  # 해당 분해합의 생성자 찾기
    num = sum((map(int, str(i))))  # i의 각 자릿수를 더함

    new_num = i + num

    if new_num == n:
        print(i)
        break
    if i == n:
        print(0)
