min_score_list = list(map(int, input().split()))
man_score_list = list(map(int, input().split()))

S = sum(min_score_list)
T = sum(man_score_list)

if S > T:
    print(S)
elif S == T:
    print(S)
else:
    print(T)
