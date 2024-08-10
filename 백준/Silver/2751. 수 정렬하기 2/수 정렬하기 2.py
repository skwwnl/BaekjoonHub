import sys

input = sys.stdin.readline

N = int(input())
s = set()
for i in range(N):
    a = int(input())
    s.add(a)

inter_list = list(s)
inter_list.sort()

for i in inter_list:
    print(i)
