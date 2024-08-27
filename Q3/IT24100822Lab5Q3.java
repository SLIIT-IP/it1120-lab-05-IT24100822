import java.util.Scanner;
public class IT24100822Lab5Q3
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int start,end,noofdate,amount;

      System.out.print("Enter start date");
      start=input.nextInt();
      System.out.print("Enter end date");
      end=input.nextInt();
 
      if(start<end)
      {
         if((start>=1) && (start<=31) && (end>=1) && (end<=31))
         {        
                noofdate=(end-start);
                if(noofdate>=5)
                {
                    amount=(48000*noofdate*80/100);
                }
                else if(noofdate>=3)
                {
                    amount=(48000*noofdate*90/100);
                }
                else 
                {
                    amount=(48000*noofdate);
                }

                System.out.println("Room Charge Per Day: Rs. 48000.0/=");
                System.out.println("Number of Days Reserved:"+noofdate);  
                System.out.println("Total Amount to be Paid:"+amount);  
          }
         else
         {
             System.out.print("invalid");
         }

     }
     else
     {
         System.out.print("Error: Days must be between 1 and 31");
     }
  }
}
   