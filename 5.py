bol = False
num = 1
while(not bol):
    isTrue = True
    for i in range(1,21):
        if(not (num % i == 0)):
            isTrue = False
            break
    if(isTrue):
        bol = True
    else: num += 1

print num
