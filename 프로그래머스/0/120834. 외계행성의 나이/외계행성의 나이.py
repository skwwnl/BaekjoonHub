def solution(age):
    age_alphabet = {i: chr(97 + i) for i in range(10)}
    answer = ''
    for i in str(age):
        answer += age_alphabet[int(i)]
    return answer