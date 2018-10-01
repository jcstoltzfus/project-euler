public class printing {
	
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		

		int num = 10;
		int sum = 0;
		for(int i = 0; i < (num / 3); i++)
		{
			sum += i * 3;
		}

		if(num % 3 == 0)
			sum += num;

		for(int i = 0; i < (num / 5); i++)
		{
			sum += i * 5;
		}
		if(num % 5 == 0)
			sum += num;

		System.out.println(sum);
	}
}