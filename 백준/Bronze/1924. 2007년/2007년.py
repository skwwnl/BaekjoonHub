x, y = map(int, input().split())

week = {
    0: "SUN",
    1: "MON",
    2: "TUE",
    3: "WED",
    4: "THU",
    5: "FRI",
    6: "SAT",
}
month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]


def check_day(x, y):
    day = 0
    for i in range(x - 1):
        day += month[i]
    day += y
    return week[day % 7]


print(check_day(x, y))
