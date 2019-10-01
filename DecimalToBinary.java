class BinaryToDecimal
{
	public static void main(String[] args)
	{
		int n=10,a;
		String x="";
		while(n>0)
		{
			a=n%2;
			x=x+""+a;
			n=n/2;
		}
		System.out.println("binary no is "+x);
	}
}
			
			
