sumsquares = 0
squaresums = 0

for i in range(1,101):
    sumsquares = sumsquares + i * i
    squaresums = squaresums + i

squaresums = squaresums * squaresums

print squaresums - sumsquares

'''or...'''
print sum([i for i in range(1,101)])**2 - sum([i * i for i in range(1,101)])
