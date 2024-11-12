def solution(numbers, k):
    
    nk = 2 * k - 1
    new_numbers = []
    
    for i in range(len(numbers)):
        if  nk > len(numbers):
            a = nk // len(numbers)
            new_numbers = numbers * (a+1)
        else:
            return numbers[k]
        
    return new_numbers[nk-1]