class StrongNumber
{
	public static void main(String[] args)
	{
		int sum=0;
		int n=481;
		int m=n;
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			for(int i=n;i>=1;i--)
			{
			
				fact=fact*i;
			
				sum=sum+i;
				n=n/10;
			}
	
		}
		if(m==sum)
		{
			System.out.println("The given no is strong number");
		}
		else
		{
			System.out.println("The given no is not strong number");
		}
	}
		
		

	}

