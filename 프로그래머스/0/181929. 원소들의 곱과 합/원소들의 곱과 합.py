def solution(num_list):
    mul, sum = 1, 0
    for i in num_list:
        mul *= i
        sum += i
    if mul < sum**2: return 1
    else : return 0