class Polindrome
{
	public static void main(String[] args)
	{
		int rev=0;
		int n=481;
		int m=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
	
		}
		if(m==rev)
		{
			System.out.println("The given no is polindrome");
		}
		else
		{
			System.out.println("The given no is not polindrome");
		}
	}
		
		

	}

