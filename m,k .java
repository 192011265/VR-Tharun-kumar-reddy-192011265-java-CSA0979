import java.util.*;
import java.io.*;
class mnk2
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter M and N and K value");
int m=sc.nextInt();
int n=sc.nextInt();
int k=sc.nextInt();

while(m<=n)
{
System.out.println(m);
m=m+k+1;
}
}
}
