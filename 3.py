'''Question: The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?'''


#DOESN'T WORK
def find_prime_factors(n, lst):
	i = 2
	while(i < int(n ** .5) + 1):
		if(n % i == 0):
			lst.append(i)
			print(i)
			n = n / i
			if(n == 1):
				n = 0
			#find_prime_factors(n, lst)
		else:
			i = i + 1
	print(lst)

find_prime_factors(12, [])
#find_prime_factors(13195, [])