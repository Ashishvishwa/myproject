import java.util.*;
class factorial
{
 int fact(int n)
 {
  if(n==1)
  return 1;
  else
  return (n*fact(n-1));
 }
}

class fibbo
{
 int fibo(int a)
 {
  if(a==1)
  return 0;
  else if(a==2)
  return 1;
  else
  return fibo(a-1) + fibo(a-2);
 }
}

class gcde
{
 int gcd(int n1,int n2)
 {
  if(n2!=0)
  return gcd(n2,n1 % n2);
  else
  return n1;  
 }
}

class Sfacto
{
 public static void main(String args[])
 {
  int ch;
  Scanner s=new Scanner(System.in);
  System.out.println("1.fact\n 2.fibo\n 3.gcd\nEnter your choice:");
  ch=s.nextInt();
  switch(ch)
  {
	  case 1 : int n,r;
	           System.out.println("Enter factorial of no:");
	           n=s.nextInt();
			   factorial f=new factorial();
			   r=f.fact(n);
			   System.out.println("fact: "+r);
			   break;
	
      case 2 : int a,t;
	           System.out.println("Enter Fibo:");
			   a=s.nextInt();  
	           fibbo f1=new fibbo();
			   t=f1.fibo(a);
			   System.out.println("fibo: "+t);
               break;
			   
	  case 3 : int n1,n2,e;
	           System.out.println("Enter n1 and n2:");
			   n1=s.nextInt(); 
               n2=s.nextInt(); 			   
	           gcde g=new gcde();
			   e=g.gcd(n1,n2);
			   System.out.println("gcd: "+e);
               break;
    default :System.out.println("invalid");

 }  
}
}