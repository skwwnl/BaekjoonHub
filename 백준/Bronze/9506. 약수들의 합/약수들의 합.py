def absolute(n):
    num_list = []
    for i in range(1, int(n ** (1 / 2)) + 1):
        if n % i == 0:
            num_list.append(i)
            num_list.append(n // i)
    num_list.sort()
    num_list.remove(n)
    if sum(num_list) == n:
        return num_list
    else:
        return False


while True:
    n = int(input())
    if n == -1:
        break
    absolute(n)
    if absolute(n) == False:
        print(str(n) + " is NOT perfect.")
    else:
        print(f"{n} = {' + '.join(map(str, absolute(n)))}")
