import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {  
    System.out.printf("\n");    
    System.out.printf("%s %10s %15s %15s%n","Denominations(INR)","USD","JPY","GBP");
    System.out.printf("____________________________________________________________________\n");
    int i;
    con(1);
    con(10);
    con(20);
    con(50);
    con(100);
    System.out.printf("\n");
    System.out.println("convert the amount(1/2/3):\n1.Amount in USD --> convert this to GBP\n2.Amount in EUR --> convert this to JPY\n3.Amount in INR --> convert this to USD");
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    System.out.println("Enter the amount");
    int b=obj.nextInt();
    switch(a){
        case 1:System.out.println("Amount of "+b+" USD is equal to "+(94.5*b)/74.3+" GBP");
               break;
        case 2:System.out.println("Amount of "+b+" EUR is equal to "+(0.90*b)+" GBP");
               break;
        case 3:System.out.println("Amount of "+b+" INR is equal to "+(b/74.3)+" USD");
               break;       
             }
    }
     public static void con(float i){
     float usd,jpy,gbp;
     usd=74.3f*i;
     jpy=0.67f*i;
     gbp=94.5f*i;   
       System.out.printf(" %.0f %25.2f %15.2f %15.2f%n",i,usd,jpy,gbp);
       System.out.printf("....................................................................\n");
    }   
}

