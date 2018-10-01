for i in range(500):
	for j in range(500):
		for z in range(500):
			if((i ** 2 + j ** 2 == z ** 2) and i + j + z == 1000):
				print i * j * z
				exit()