class SumOfEachDigit
{
	public static void main(String[] args)
	{
		int sum=0;
		int n=481;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
	
		}
		System.out.println(sum);

	}

}