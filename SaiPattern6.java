class SaiPattern6
{
public static void main(String[] args)
{
int slash=5;
int star=1;

for(int i=1;i<=5;i++)
{
for(int j=1;j<=slash;j++)
{
System.out.print(" - ");
}
for(int k=1;k<=star;k++)
{
System.out.print(" * ");
}
star=star+2;

slash=slash-1;

System.out.println();
}
}
}