num_list = {
    10: "A",
    11: "B",
    12: "C",
    13: "D",
    14: "E",
    15: "F",
    16: "G",
    17: "H",
    18: "I",
    19: "J",
    20: "K",
    21: "L",
    22: "M",
    23: "N",
    24: "O",
    25: "P",
    26: "Q",
    27: "R",
    28: "S",
    29: "T",
    30: "U",
    31: "V",
    32: "W",
    33: "X",
    34: "Y",
    35: "Z",
}

N, B = map(int, input().split())


def digit_to_num(N, B):
    left_list = []
    result = []
    while True:
        if N < B:
            left_list.append(N)
            break
        else:
            N, left = divmod(N, B)
            left_list.append(left)
    left_list.reverse()

    # 최종 진법으로 변환
    for key in left_list:
        if key in num_list.keys():
            result.append(num_list.get(key))
        else:
            result.append(str(key))
    return "".join(result)


print(digit_to_num(N, B))
