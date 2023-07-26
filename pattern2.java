package kajallmam;

//1  * * * *
//    * * *
//     * *
//      *
//
//2--
//        *
//      *   *
//     *  *   *
//    *  *  *   *
//    *  *  *   *
//      *  *  *
//       *  *
//         *
//
//3----
//switch practice
//write a program to read a week day number and print weekend name using switch
//
//4---
//write a program to read gender (m/f ) and print the corresponding  gender using switch
//
//5--
//write a program to check whether the number is even or odd
//
//6---
//write a program to create a simple calculator
//
//7--
//write a program to check whether a person is eligilble or not for vote
//
//8--
//write a program to find the maximum number
//
//9--
//  *
//  *  *
//  *    *
//  *******
//
//10---
//1****
//22***
//333**
//4444*
//55555
//
//11--
//1****
//12***
//123**
//1234*
//12345
//
//12--
//  *
//    *
//      *
//        *
//
//13--
//  ****
//  *  *
//  *  *
//  ****
//
//14--
//  *****
//  **  *
//  * * *
//  *  **
//  *****
//
//15--
//  1
//  4 9
//  16 25 36
//
//16--
//  1
//  4 4
//  9  9  9
//  16 16 16 16
//
//17---
//   1
//   8 27
//   64 125 216
//
//18----
//  ****
//  *
//  *
//  *
//
//19---
//  ****
//    **
//   * *
//  *  *
//
//20---
//    *
//   *
//  *
// *

//1--how many types of memory areas are allocated by JVM
//2--what is JIT compiler
//3--what is platform


import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//        1..//////////////...........///////////////......///////////////////.............///////////.........../////////

//        * * * *
//         * * *
//          * *
//           *
//        for(int i=4;i>=1;i--)
//        {
//            for(int j=1;j<=4-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        2.........////////////.........../////////........../////////........................////////////
//        *
//       * *
//      * * *
//     * * * *
//     * * * *
//      * * *
//       * *
//        *
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=4;i>=1;i--)
//        {
//            for(int j=1;j<=4-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        3........../////////////.........../////////////...///////////////................////////////////
//        System.out.println("enter the no of day between 1 to 7");
//        int ch= sc.nextInt();
//        switch (ch)
//        {
//            case 1:
//                System.out.println("sunday");
//                break;
//            case 2:
//                System.out.println("monday");
//                break;
//            case 3:
//                System.out.println("tuesday");
//                break;
//            case 4:
//                System.out.println("wednesday");
//                break;
//            case 5:
//                System.out.println("thursday");
//                break;
//            case 6:
//                System.out.println("friday");
//                break;
//            case 7:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("this is not weekend");
//        }

//        4....///////////////////................../////////////////.............//////////////..........////////////////
//        System.out.println("enter m for male and f for female");
//        String c= sc.next();
//        switch(c.toLowerCase())
//        {
//            case "m" :
//                System.out.println("male");
//                break;
//            case "f":
//
//                System.out.println("female");
//                break;
//            default:
//                System.out.println("other");
//        }

//        5........////////////////..............///////////////////............../////////////...........
//        System.out.println("enter number");
//        int n=sc.nextInt();
//        n=n%2;
//        switch(n)
//        {
//            case 1:
//                System.out.println("this is odd");
//                break;
//            case 0:
//                System.out.println("this is even");
//                break;
//        }

//        6........////////////////////.....................////////////////................//////////////............
//        System.out.println("enter any number");
//        int a= sc.nextInt();
//        System.out.println("enter any number");
//        int b= sc.nextInt();
//        System.out.println("enter 1 for add or 2 for substract or 3 for multiply or 4 for division");
//        int ch= sc.nextInt();
//        switch(ch)
//        {
//            case 1:
//                System.out.println(a+b);
//                break;
//            case 2:
//                System.out.println(a-b);
//                break;
//            case 3:
//                System.out.println(a*b);
//                break;
//            case 4:
//                System.out.println(a/b);
//                break;
//        }

//        7.........//////////////////......................///////////////////............../////////////////
//        System.out.println("enter age");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//
//        switch(n)
//        {
//            case 18:
//                System.out.println("You are eligible to vote!");
//                break;
//            case 17:
//                System.out.println("You will be eligible to vote next year.");
//                break;
//            default:
//                System.out.println("You are not eligible to vote yet.");
//        }



//        9...........///////////////.............//////////////////..................////////////////...............
//        *
//        * *
//        *   *
//        * * * *
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//                if(i==4 || j==1 || i==j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

//        10....//////////////.................../////////////..................///////////////................
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i+" ");
//            }
//            for(int k=1;k<=5-i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        11.......////////////................./////////////////////.................//////////////////.

//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            for(int k=1;k<=5-i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        12.....///////////...............///////////................////////////...............//////////////............
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//              System.out.println();
//        }

//        13.........//////////////.................//////////////............./////////////////..............//////////
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==5 || j==1 || j==5)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

//        14.........../////////////................/////////////...........//////////////................/////////
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==5 || j==1 || j==5 || i==j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

//        15............//////////////////................../////////////...............///////////////...........
//        int n=1;
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(n*n+" ");
//                n++;
//            }
//            System.out.println();
//        }

//        16.........../////////////////////................///////////////................./////////////............/

//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i*i+" ");
//
//            }
//            System.out.println();
//        }

//        17..........////////////////...................///////////////////..................///////////////
//        int n=1;
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(n*n*n+" ");
//                n++;
//
//            }
//            System.out.println();
//        }

//        18..........///////////////..............////////////////................///////////
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//               if(i==1 || j==1)
//                   System.out.print("* ");
//               else
//                   System.out.print("  ");
//
//            }
//            System.out.println();
//        }

//        19...........///////////////////...........//////////////////////................//////////////////////..........
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=4;j>=1;j--)
//            {
//                if(i==1 || j==1 || i==j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//
//            }
//            System.out.println();
//        }

//        20...........//////////////////.............//////////////.............///////////////......................./
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=4;j>=1;j--)
//            {
//                if( i==j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//
//            }
//            System.out.println();
//        }

//        21.............////////////////////////..........................////////////////////////////..........................

//        1
//        1 * 2
//        1 * 2 * 3
//        1 * 2 * 3 * 4

//        System.out.println("enter row");
//        int n= sc.nextInt();
//        for(int i=1;i<=n+n;i+=2)
//        {
//            int m=1;
//            for(int j=1;j<=i;j++)
//            {
//                if(j%2==0)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(m+" ");
//                    m++;
//                }
//            }
//            System.out.println();
//        }

//        22................//////////////////////////////..........................///////////////////////////............
//             1
//            1  1
//           1  2  1
//          1  3  3  1
//         1  4  6  4  1


//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5-i;j++)
//            {
//                System.out.print(" ");
//            }
//            int n=1;
//            for(int k=1;k<=i;k++)
//            {
//
//                if( k==1){
//                    System.out.print(n+" ");
//                }
//                else {
//                    n = n * (i - k+1) / (k - 1);
//                    System.out.print(n + " ");
//                }
//            }
//            System.out.println();
//        }
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            int n=1;
            for(int k=0;k<=i;k++)
            {

                System.out.print(n + " ");
                n=n*(i-k)/(k+1);

            }
            System.out.println();
        }
        }
    }

