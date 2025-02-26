word = input()

test = "CAMBRIDGE"
list_test = list(test)
list_word = list(word)
new_list = []
for i in list_word:
    if i not in list_test:
        new_list.append(i)

print("".join(new_list))
