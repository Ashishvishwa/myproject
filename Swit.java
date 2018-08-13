import java.util.* ;
class Fact
{
 int n;
 
 void factorial(int n)
 {int fact=1,i;
 for(i=1;i<=n;i++)
 {
 fact=fact*i;
 }
 System.out.println("Fact " +fact);
 }
}
class armstrong
{
 int a;
 void arm(int a)
 {
  int x,h,sum=0;
  h=a;
  while(a!=0)
  {
  x=a%10;
  sum=sum+x*x*x;
  a=a/10;
  }
if(sum==h)
  {
  System.out.println("It is an Amstrong no: " );
  }
  else
   {
  System.out.println("Not an Amstrong: " );
  }
 }
} 

 class Fibo
 { 
  int d;
  void Fibonacci(int d)
  {
  int a=0,b=1,c;
  int i;
  System.out.println(+a);
  System.out.println(+b);
  for(i=0;i<d-2;i++)
  {
  c=a+b;
  System.out.println(+c);
  a=b;
  b=c;
  }
  }
 }

class Swit
{
public static void main(String args[])
{
int ch ;

Scanner sc =new Scanner(System.in);
System.out.println(" 1.Factorial\n 2.Fibo\n 3.arm \nEnter your choice");
ch=sc.nextInt();
switch(ch)
{
	case 1: int n;
	        System.out.println("Enter factorial no");
			n=sc.nextInt();
			Fact f1=new Fact();
	        f1.factorial(n);
			break;
	case 2: int d;
	        System.out.println("Enter no");
			d=sc.nextInt();
			Fibo f2=new Fibo();
	        f2.Fibonacci(d);
			break;
   case 3:  int a;
           System.out.println("Enter the armstrong number");
           a=sc.nextInt();
           armstrong a1=new armstrong();
           a1.arm(a);
           break;			
			
	default:System.out.println("invalid");
	
}
}
}
