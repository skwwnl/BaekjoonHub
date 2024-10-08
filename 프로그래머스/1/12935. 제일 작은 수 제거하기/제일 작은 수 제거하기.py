def solution(arr):
    if len(arr) == 0 or len(arr) == 1:
        return [-1]
    arr.remove(min(arr))

    return arr