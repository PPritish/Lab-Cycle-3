import java.util.*;
import java.io.*;
class main1

{
  void factorial(int n)
  {
  int f=1,i;
  for(i=1;i<=n;i++)
  f=f*i;
  System.out.println(n+"!"+"="+f);
  }
  void sumofdigits(int n)
  {
    int sum=0,dg;
    while(n!=0)
    {
      dg=n%10;
      sum=sum+dg;
      n=n/10;
    }
    System.out.println("sum of digits:"+sum);
  }
  public static void main(String args[])
  {
    main number=new main();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to find the factorial");
    int n=s.nextInt();
    System.out.println("Enter the number to find the sum of digits");
    int m=s.nextInt();
    number.factorial(n);
    number.sumofdigits(m);
  } 
}
