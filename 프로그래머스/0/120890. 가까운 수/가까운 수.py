def solution(array, n):
    answer = 0
    array.sort()
    box = []
    
    for i in array:
        box.append(abs(n-i))
    a = box.index(min(box))
    
    return array[a]
        