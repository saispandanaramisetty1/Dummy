class Pyramid1
{
	public static void main(String[] args)
	{
		int space=0;
		int star=5;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" * ");
			}
			space=space+1;
			star=star-2;

			System.out.println();
		}
}
	
}