def solution(array):
    # Count 할 배열
    cnt = [0] * (max(array) + 1)

    # 해당 인덱스 Count
    for i in range(len(array)):
        cnt[array[i]] += 1

    if count_dup := cnt.count(max(cnt)) > 1:
        return -1
    return cnt.index(max(cnt))