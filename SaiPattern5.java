class SaiPattern5
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
for(int j=6;j>=1;j--)
{
if(i>=j)
{
System.out.print(" * ");
}
else
{
System.out.print(" - ");
}
}
System.out.println();
}
}
}