import java.util.Scanner;
public  class Task2
{
    int total = 0;
  
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
       
        int total=0;
        float Avg;
        
       
        System.out.println("Enter the No of subjects-:  ");
        int totSubjects = sc.nextInt();

        for(int i=1; i<=totSubjects; i++)
        {
            System.out.println("->Subject "+i);
            System.out.print("Enter the marks : ");
            int Marks=sc.nextInt();


            if(Marks <= 0 || Marks > 100)
            {
                System.out.println("Invalid marks! Please enter the valid marks.");
                break;
            } 
            total=total+ Marks;

        }

            Avg=(total/totSubjects);

            
            System.out.println("----------------------------------------");
            System.out.println("*************Your Results***************");
            System.out.println("----------------------------------------");
            System.out.println("Your Total Marks : "+total);
            System.out.println("Your Average     : "+Avg);  
            
           
            if(Avg>0 && Avg<=34)
            System.out.println("Your Grade       : E");

           else if(Avg>=35 && Avg<=39)
            System.out.println("Your Grade       : D");

           else if(Avg>=40 && Avg<=44)
            System.out.println("Your Grade       : D+");

           else if(Avg>=45 && Avg<=49)
            System.out.println("Your Grade       : C-");

           else if(Avg>=50 && Avg<=54)
            System.out.println("Your Grade       : C");

           else if(Avg>=55 && Avg<=59)
            System.out.println("Your Grade       : C+");

           else if(Avg>=60 && Avg<=64)
            System.out.println("Your Grade       : B-");

           else if(Avg>=65 && Avg<=69)
            System.out.println("Your Grade       : B");

           else if(Avg>=70 && Avg<=74)
            System.out.println("Your Grade       : B+");

           else if(Avg>=75 && Avg<=79)
            System.out.println("Your Grade       : A-");

           else if(Avg>=80 && Avg<=84)
            System.out.println("Your Grade       : A");

           else if(Avg>=85 && Avg<=100)
            System.out.println("Your Grade       : A+");
        
           else
             System.out.println("Invalid Grade");

    }
}
