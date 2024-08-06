S = input()

Vowels = ["a", "e", "i", "o", "u"]

count_vowel = 0

for i in S:
    if i in Vowels:
        count_vowel += 1
print(count_vowel)
