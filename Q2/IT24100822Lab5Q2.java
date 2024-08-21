import java.util.Scanner;
public class IT24100822Lab5Q2
{

  public static void main(String[] args)
  {
     Scanner input=new Scanner(System.in);
     int noofmembers;

     System.out.print("Enter number of members");
     noofmembers=input.nextInt();
     
     if(noofmembers==1)
     {    
        System.out.print("you are entitled pen");
     }
     
     else if(noofmembers==2)
     {
        System.out.print("you are entitled to umbrella");
     }
    
     else if(noofmembers==3)
     {
        System.out.print("you are entitled to bag");
     }

     else if(noofmembers==4)
     {
        System.out.print("you are entitled to Travelling Chair");
     }
     else if(noofmembers>=5)
     {
       System.out.print("you are entitled to headphone");
     }
    
     else
     {
       System.out.print("input must be a number 0 or greater");
     }

  }
}
