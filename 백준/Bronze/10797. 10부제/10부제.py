N = int(input())

violation_vehicle_count = 0

i = list(map(int, input().split()))

for a in i:
    if N == a:
        violation_vehicle_count += 1

print(violation_vehicle_count)
