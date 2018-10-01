def is_prime(n):
    for i in range(2, int(n**.5 + 1)):
        if(i == n):
            return True
        if(n % i == 0):
            return False

    return True

num = 2
counter = 0
print(is_prime(2), is_prime(3), is_prime(4))
while(True):
    if(is_prime(num)):
        counter += 1

    if(counter == 10001):
        print(num)
        break

    num += 1
