num1 = 1
num2 = 2
num3 = 0
total = 2

while num3 < 4000000:
	num3 = num2 + num1
	if num3 % 2 == 0:
		total += num3
	num1 = num2
	num2 = num3
	print num1
	print num2
	print num3

print total