class Large
{
 public static void main(String args[])
 {
  int a,b;
 
  System.out.println("Your Largest number:");
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  
  if(a>b)
  {
    System.out.println("a is greater :" +a);
  }
  else
  {
    System.out.println("b is greater :" +b);
  }
 }
} 
  