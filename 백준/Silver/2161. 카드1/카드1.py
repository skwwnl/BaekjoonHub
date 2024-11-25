N = int(input())

card = [i for i in range(1, N + 1)]
drop_card = []

i = 1
while True:
    if len(card) == 1:
        break
    c = card.pop(i - 1)
    drop_card.append(str(c))
    d = card.pop(i - 1)
    card.append(d)
drop_card.append(str(card[0]))
print(" ".join(drop_card))
