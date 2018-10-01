num = 0
largestpal = 0

def isPalindrome (x):
	mybool = True
	for i in range(len(x)):
		if x[i] != x[len(x) - i - 1]:
			mybool = False
	return mybool

for i in range (100, 1000):
	for j in range (100, 1000):
		num = i * j
		if isPalindrome(str(num)) and num > largestpal:
			largestpal = num

print largestpal

# took a second or two (on MBP)
