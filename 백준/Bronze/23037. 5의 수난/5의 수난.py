def calculate_power(input_string):
    result = 0
    for char in input_string:
        result += int(char) ** 5
    return result

a = input()
print(calculate_power(a))