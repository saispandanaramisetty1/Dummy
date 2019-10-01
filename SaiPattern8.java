class SaiPattern8
{
public static void main(String[] args)
{
int space=4;
int star=1;
int n=9;
for(int i=1;i<=9;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print("   ");
}
for(int k=1;k<=star;k++)
{
System.out.print(" * ");
}
if(i<=n/2)
{
star=star+2;
space=space-1;
}
else
{
star=star-2;

space=space+1;

}

System.out.println();
}
}
}