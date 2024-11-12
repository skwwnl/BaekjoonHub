from collections import deque

def solution(numbers, direction):
    d = deque(numbers)
    if direction == "right":
        d.rotate(1)
    elif direction == "left":
        d.rotate(-1)
    return list(d)