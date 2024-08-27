import java.util.Scanner;
public class IT24100822Lab5Q1
{
  public static void main(String[] args)
  {

     Scanner input=new Scanner(System.in);
     int no1,no2,no3,max,min;


     System.out.print("Enter number1");
     no1=input.nextInt();
     System.out.print("Enter number2");
     no2=input.nextInt();
     System.out.print("Enter number3");
     no3=input.nextInt();


     if(no1>no2)
     {
       max=no1;
       min=no2;
     }

     else
     {
       max=no2;
       min=no1;
     }
    
     if(no3>max)
     {
        max=no3;
     }
    
     if(no3<min)
     {
        min=no3;
     }
     System.out.print("User entered numbers are:"+ no1 + " " + no2+ " " + no3);
     System.out.print("max is" +max);
     System.out.print("min is" +min);
     
  }
}
     