N = int(input())

while True:
    if N <= 10:
        break
    else:
        print("재입력")
        continue
    
for _ in range(N):
    word = input()
    print(word.lower())