total = 0;
count = 0;

'''while count < 1000:
	if count%3==0:
		total += count
	elif count%5==0:
		total += count
	count += 1'''

'''while count < 1000:
	if count%3 == 0 or count%5 == 0:
		total += count
	count += 1'''

'''for i in range (1000):
	if i % 3 == 0 or i % 5 == 0:
		total += i'''

'''for i in range (0, 1000, 3):
	total += i

for i in range (0, 1000, 5):
	if i%3 == 0:
		total -= i
	total += i'''

total = sum([i for i in range(1000) if i%3==0 or i%5==0])

print total