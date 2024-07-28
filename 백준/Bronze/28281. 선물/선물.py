N, X = map(int, input().split())

all_case_amount = []

C = list(map(int, input().split()))

for i in range(N - 1):
    all_case_amount.append(C[i] * X + C[i + 1] * X)
print(min(all_case_amount))
