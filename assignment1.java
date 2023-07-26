package kajallmam;//1----123....>432
//2---armstrong number (153) [1*1*1 +5*5*5 + 3*3*3]
//3---palindrome number (12321)==(12321)
//4---132--->342
//5---123--->234
//6---2...10 table
//7....prime number
//2,3,7,11
//no value initializatin

//8.....256-- 3 digit
//56432---5 digit

//9......while loop
//****
//****
//****
//****

//*
//**
//***

//***
//**
//*
//

//10......user input
//...34......67 value print
//        ----------------------
//.........34....67...even number print
//        -------------------------
//.......34......67...even sum
//----------------------------



import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//1......................///////////////////////////.........../////////////////................
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int rem;
//        int sum=0;
//        while(n>0)
//        {
//            rem=n%10;
//            sum=sum*10+rem;
//            n=n/10;
//        }
//        System.out.println("the reverse number is= "+sum);


//        2...........////.........///////////////////////....................///////////////////////..............
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int b=n;
//        int rem;
//        int sum=0;
//        while(n>0)
//        {
//            rem=n%10;
//            sum=sum+rem*rem*rem;
//            n=n/10;
//        }
//        System.out.println("the number is="+sum);
//        if(b==sum)
//            System.out.println("it is armstrong number");
//        else
//            System.out.println("it is not armstrong number");

//        3........../////////////////................//////////////////////............
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int b=n;
//        int rem;
//        int sum=0;
//        while(n>0)
//        {
//            rem=n%10;
//            sum=sum*10+rem;
//            n=n/10;
//        }
//        System.out.println("the number is="+sum);
//        if(b==sum)
//            System.out.println("it is palindrome number");
//        else
//            System.out.println("it is not palindrome");

//        4.............../////////////////////////....................../////////////////////..........

//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int rem;
//        int sum=0;
//        while(n>0)
//        {
//            rem=n%10;
//            sum=sum*10+rem+1;
//            n=n/10;
//        }
//        System.out.println("the reverse number is= "+sum);

//        5..................///////////////////////////......................../////////////////////.
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int rem;
//        int sum=0;
//        int sum1=0;
//        while(n>0)
//        {
//            rem=n%10;
//            sum=sum*10+rem+1;
//            n=n/10;
//        }
//        System.out.println("the reverse number is= "+sum);
//
//        while(sum>0)
//        {
//            rem=sum%10;
//            sum1=sum1*10+rem;
//            sum=sum/10;
//        }
//        System.out.println("the number is= "+sum1);


//        6.....////////////////////...................////////////////////////................./////////////////////////
//        int a=2;
//        int prod;
//
//       while(a<=10)
//       {
//           int i=1;
//           while (i <= 10)
//           {
//               prod = a * i;
//               System.out.println(+prod);
//               i++;
//           }
//           a++;
//           System.out.println("table of "+a);
//       }


//        8.................///////////////////...................///////////////////.................../////////////////
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int count=0;
//
//        while(n>0)
//        {
//            n=n/10;
//            count++;
//
//        }
//        System.out.println("the total digit is= "+count);


//        9..........///////////////////..................////////////////////////////////........................//////////
//        int i=1;
//        while(i<=4)
//        {
//            int j=1;
//            while(j<=4)
//            {
//                System.out.print("*");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

//        10................/////////////////..................//////////////////////..................////////////
//        int i=1;
//        while(i<=3)
//        {
//            int j=1;
//            while(j<=i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

//        11............////////////////////...................//////////////////////.............////////////...........
//        int i=1;
//        while(i>=1)
//        {
//            int j=1;
//            while(j<=i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.println();
//        }

//        12..............////////////////............./////////////////........................//////////////////..........
//        System.out.println("enter first number");
//        int a= sc.nextInt();
//        System.out.println("enter second number");
//        int b= sc.nextInt();
//        while(a<=b)
//        {
//            System.out.println(a);
//            a++;
//        }

//        13................./////////////////////////....................//////////////////////////
//        System.out.println("enter first number");
//        int a= sc.nextInt();
//        System.out.println("enter second number");
//        int b= sc.nextInt();
//        while(a<=b)
//        {
//            if(a%2==0)
//            {
//                System.out.println(a);
//            }
//            a++;
//        }

//        14.............////////////////////.................../////////////////............../////////////////
//        System.out.println("enter first number");
//        int a = sc.nextInt();
//        System.out.println("enter second number");
//        int b = sc.nextInt();
//        int sum=0;
//        while (a <= b)
//        {
//            if (a % 2 == 0)
//            {
//                System.out.println(a);
//                sum=sum+a;
//            }
//            a++;
//        }
//        System.out.println("total sum of all even no.= "+sum);

//        15..............///////////////........................../////////////////////......................./

//        System.out.println("enter number");
//        int n= sc.nextInt();
//        int flag=0;
//        int i=2;
//        while(i<n)
//        {
//
//            if(n%i==0)
//            {
//                flag=1;
//                break;
//            }
//            i++;
//
//        }
//        if(flag==1)
//            System.out.println("not prime number");
//        else
//            System.out.println("prime number");
//

        ///////////////////////prime number////////////////////////////////////////
        System.out.println("enter number");
        int num= sc.nextInt();
        int a=2;
        while(num>=a)
        {
            if(num%a==0)
            {
                System.out.println("not prime number");
                break;
            }

            if(num-1==a)
            {
                System.out.println("prime number");
            }
            a++;
        }
//
//        System.out.println("enter number");
//        int n= sc.nextInt();
//        int a=2;
//        int flag=0;
//        while(n>a)
//        {
//            if (n % a == 0)
//            {
//                flag = 1;
//                break;
//            }
//            a++;
//        }
//
//        if(flag==1)
//            System.out.println("not prime number");
//        else
//            System.out.println("prime number");





    }
}
