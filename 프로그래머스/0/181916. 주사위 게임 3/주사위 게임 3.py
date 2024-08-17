def solution(a, b, c, d):

    dice = [a, b, c, d]
    # 주사위 결과를 정렬
    dice.sort()

    # 1. 네 개의 주사위가 모두 같은 숫자일 때
    if len(set(dice)) == 1:
        return 1111 * dice[0]

    # 2. 세 개의 주사위가 같은 숫자이고, 나머지 한 개의 주사위가 다른 숫자일 때
    elif len(set(dice)) == 2 and (dice.count(dice[0]) == 3 or dice.count(dice[3]) == 3):
        p = dice[0] if dice.count(dice[0]) == 3 else dice[3]
        q = dice[3] if dice.count(dice[0]) == 3 else dice[0]
        return (10 * p + q) ** 2

    # 3. 두 개의 주사위가 같은 숫자이고, 나머지 두 개의 주사위가 같은 숫자일 때
    elif len(set(dice)) == 2 and dice.count(dice[0]) == 2:
        p = dice[0]
        q = dice[2]
        return (p + q) * abs(p - q)

    # 4. 두 개의 주사위가 같은 숫자이고, 나머지 두 개의 주사위가 각각 다른 숫자일 때
    elif len(set(dice)) == 3 and (dice.count(dice[0]) == 2 or dice.count(dice[1]) == 2 or dice.count(dice[2]) == 2):
        if dice.count(dice[0]) == 2:
            p = dice[0]
            q = dice[2]
            r = dice[3]
        elif dice.count(dice[1]) == 2:
            p = dice[1]
            q = dice[0]
            r = dice[3]
        else:
            p = dice[2]
            q = dice[0]
            r = dice[1]
        return q * r

    # 5. 네 개의 주사위가 모두 다른 숫자일 때
    else:
        return min(dice)
