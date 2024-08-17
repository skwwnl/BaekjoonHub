N = int(input())

cnt = 0
room_number = 1

while N > room_number:
    if N > room_number:
        cnt += 1
    room_number += cnt * 6

print(cnt+1)
