import sys

def input():
    return sys.stdin.readline()

N = int(input())

count_list = [0] * 10001

for _ in range(N):
    num = int(input())
    count_list[num] += 1

for i in range(1, 10001):
    if count_list[i] != 0:
        for _ in range(count_list[i]):
            print(i)