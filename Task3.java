package basic.corejava;
import java.util.Scanner;
public class Task3
{
	    static int add(int a, int b)
		{
			return a+b;
		}
		static int sub(int a,int b)
		{
			return a-b;
		}
		static int mul(int a, int b)
		{
			return a*b;
		}
		static int div(int a, int b)
		{
			return a/b;
		}
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  int choice;
	  int num1,num2,result;
	  do
	  {
		  System.out.println("1.Addition");
		  System.out.println("2.Subtraction");
		  System.out.println("3.Multiplication");
		  System.out.println("4.Division");
		  System.out.println("5.Exit");
		  System.out.println("Enter your choice:");
		  choice= in.nextInt();
		  if(choice>=1&&choice<=4)
		  {
			  System.out.println("Enter num1:");
			  num1=in.nextInt();
			  System.out.println("Enter num2:");
			  num2=in.nextInt();
		  }
		  else
		  {
			  num1=num2=0;
		  }
		  switch(choice)
		  {
		  case 1:
			  result=add(num1,num2);
			  System.out.printf("Addition of %d and %d is %d",num1,num2,result);
			  break;
		  case 2:
			  result=sub(num1,num2);
			  System.out.printf("Subtraction of %d and %d is %d",num1,num2,result);
			  break;
		  case 3:
			  result=mul(num1,num2);
			  System.out.printf("Multiplication of %d and %d is %d",num1,num2,result);
			  break;
		  case 4:
			  result=div(num1,num2);
			  System.out.printf("Division of %d and %d is %d",num1,num2,result);
			  break;
		  case 5:
			  System.out.println("Exit");
			  break;
		  default:
			  System.out.println("Invalid choice");  
		  }
	  }  while(true);
	in.close();
  }
}
