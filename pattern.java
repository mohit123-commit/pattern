package kajallmam;


//1--
//12345
//12345
//12345
//12345
//12345
//
//2--
//1111
//2222
//3333
//4444
//
//3--
//1
//12
//123
//1234
//
//4--
//1
//22
//333
//4444
//
//5--
//54321
//54321
//54321
//54321
//54321
//
//6--
//55555
//44444
//33333
//22222
//11111
//
//7--
//  *
// **
//***
//
//8--
//***
// **
//  *
//
//9--
//  *
// **
//***
//***
// **
//  *
//
//10--
//
//        *
//        **
//        ***
//        **
//        *
//
//11--
//    *
//   * *
//  * * *
// * * * *
//* * * * *

//12--
//  ###*
//  ##**
//  #***
//  ****
//
//13---
//  ****
//  #***
//  ##**
//  ###*

//14--
//   1 2 3 4
//   5 6 7 8
//   9 10 11 12
//   13 14 15 16
//
//15---
//  2 4 6 8 10
//  12 14 16 18 20
//  22 24 26 28 30
//  32 34 36 38 40
//  42 44 46 48 50

//16--
//  1 2 3 4 5
//  2 4 6 8 10
//  3 6 9 12 15
//  4 8 12 16 20
//  5 10 15 20 25
//
//17--
//  01010
//  10101
//  01010
//  10101
//
//18--
//  1 0 1 0 1
//  0 1 0 1 0
//  1 0 1 0 1
//  0 1 0 1 0

//19
//  0 0 0 0
//  1 1 1 1
//  0 0 0 0
//  1 1 1 1

//20--
//  1 1 1 1
//  0 0 0 0
//  1 1 1 1
//  0 0 0 0



 import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        1................./////////////...........////////////////...............///////////////////............./
//           for(int i=1;i<=5;i++)
//           {
//               for(int j=1;j<=5;j++)
//               {
//                   System.out.print(j);
//               }
//               System.out.println();
//           }

//        2.........../////////////............////////////////...............//////////////////..........
//          for(int i=1;i<=4;i++)
//          {
//              for(int j=1;j<=4;j++)
//              {
//                  System.out.print(i);
//              }
//              System.out.println();
//          }

//        3.................../////////////.........////////////////..............///////////...........
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        4...........////////////.................///////////////.............../////////................///////
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        5...........////////////////....................../////////////...............//////////////..........
//        for(int i=5;i>=1;i--)
//        {
//            for(int j=5;j>=1;j--)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        6........./////////////...............//////////////..............////////////////...............
//        for(int i=5;i>=1;i--)
//        {
//            for(int j=5;j>=1;j--)
//            {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        7..........//////////////.............///////...................////////////////...........//////////////
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=3-i;j++)
//            {
//                System.out.print(" ");
//            }
//                for(int k=1;k<=i;k++)
//                {
//                    System.out.print("*");
//                }
//            System.out.println();
//        }

//        8.............////////////////................//////////////...............////////////.........../////
//        for(int i=3;i>=1;i--)
//        {
//            for(int j=1;j<=3-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        9........../////////////........../////////////..............//////////////...............//////////////
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=3-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=3;i>=1;i--)
//        {
//            for(int j=1;j<=3-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        10.......///////////............//////////////.......////////////.............///////////////...........
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=3-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=2;i>=1;i--)
//        {
//            for(int j=1;j<=2-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        11........///////////////..............////////////................//////////////............../////////////....
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        12.............../////////////////////..................//////////////////.................//////////
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4-i;j++)
//            {
//                System.out.print("#");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        13..........///////////////..............//////////////............//////////////............./
//        for(int i=4;i>=1;i--)
//        {
//            for(int j=1;j<=4-i;j++)
//            {
//                System.out.print("#");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        14...........//////////////..............//////////////..................////////////////...........
//        int count=1;
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }

//        15........////////////////............../////////////..............//////////////............
//        int count=2;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print(count+" ");
//                count++;
//                count++;
//            }
//            System.out.println();
//        }

//        16...........////////////............//////////////...........////////////////...........///////////.
//        int count=1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print(j*count+" ");
//            }
//            count++;
//            System.out.println();
//        }
//        -----------------------------------------------------------------------
//
//        for(int i=0;i<=4;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                System.out.print(i+j+" ");
//            }
//
//            System.out.println();
//        }

//        17...........//////////////................////////////..............////////////.............//////////
//        for(int i=1;i<=4;i++)
//        {
//            for (int j = 1; j <= 5; j++)
//            {
//                if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0)
//                {
//                    System.out.print("0 ");
//                }
//                else
//                {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }

//        18.........///////////////..............//////////////////...............///////////////............///////
//        for(int i=1;i<=4;i++)
//        {
//            for (int j = 1; j <= 5; j++)
//            {
//                if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0)
//                {
//                    System.out.print("1 ");
//                }
//                else
//                {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

//        19................/////////////................//////////..............///////////............//////////////
//        0 0 0 0
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1
//
//        for(int i=2;i<=5;i++)
//        {
//            for (int j = 1; j <= 4; j++)
//            {
//                System.out.print(i%2+" ");
//            }
//            System.out.println();
//        }

//        20......//////////////...................///////////////////..................////////////
//        for(int i=1;i<=4;i++)
//        {
//            for (int j = 1; j <= 5; j++)
//            {
//                if(i%2==0 )
//                {
//                    System.out.print("0 ");
//                }
//                else
//                {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }

//        21........////////////.............////////////............../////////////...........//////////
//        1 6 11 16
//        2 7 12 17
//        3 8 13 18
//        4 9 14 19
//        5 10 15 20

//        int n;
//        System.out.println("enter row");
//        int a=sc.nextInt();
//        System.out.println("enter column");
//        int b= sc.nextInt();
//        for(int i=1;i<=a;i++)
//        {
//            n=i;
//            for(int j=1;j<=b;j++)
//            {
//                System.out.print(n+" ");
//                n=n+a;
//            }
//            System.out.println();
//        }

//        22...........///////////////////........................./////////////////.............////////////................
//        1 8 9 16
//        2 7 10 15
//        3 6 11 14
//        4 5 12 13


//        System.out.println("enter row");
//        int n= sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            int x=i;
//            int y=n-i+1;
//            for(int j=1;j<=n;j++)
//            {
//
//                if(j%2==1)
//                {
//                    System.out.print(x+" ");
//                }
//                else
//                {
//                    System.out.print(y+" ");
//                }
//                x=x+n;
//                y=y+n;
//            }
//            System.out.println();
//        }

//       23....../////////////..............////////////////...............////////////..............////////////
//        5 10 15 20 25
//        4 9  14  19 24
//        3 8  13  18 23
//        2 7  12  17 22
//        1 6  11  16 21

//        System.out.println("enter column");
//        int n= sc.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            int x=i;
//            for(int j=n;j>=1;j--)
//            {
//                System.out.print(x+" ");
//                x=x+n;
//            }
//            System.out.println();
//        }

//        24........//////////...............//////////////................../////////////////............./////////////./
//        1
//        2 3
//        3 4 5
//        4 5 6 7
//        5 6 7 8 9

//          for(int i=1;i<=5;i++)
//          {
//              int x=i;
//              for(int j=1;j<=i;j++)
//              {
//                  System.out.print(x);
//                  x++;
//              }
//              System.out.println();
//          }

//        25.........///////////............/////////////........../////////////...........
//          0
//          1 0
//          0 1 0
//          1 0 1 0
//          0 1 0 1 0

//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                if(i%2==0 && j%2==0 || i%2==1 && j%2==1 )
//                {
//                    System.out.print("0");
//                }
//                else
//                {
//                    System.out.print("1");
//                }
//            }
//            System.out.println();
//        }

//        26......../////////////////.............///////////////..............////////////....................
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                if(i%2==0 && j%2==0 || i%2==1 && j%2==1 )
//                {
//                    System.out.print("1 ");
//                }
//                else
//                {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

//        27.....//////////////////...............////////////////............../////////////................
//        pattern of letter A..........
//        for(int i=1;i<=6;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==4 || j==1 || j==5)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        28.....//////////////////...............////////////////............../////////////................
//        pattern of letter B..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==4 || i==7 || j==1 || j==5)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        29.....//////////////////...............////////////////............../////////////................
//        pattern of letter C..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==1  || i==7 || j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        30.....//////////////////...............////////////////............../////////////................
//        pattern of letter D..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=9;j++)
//            {
//                if(i==1 || i==7 || j==3 || j==9)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        29.....//////////////////...............////////////////............../////////////................
//        pattern of letter E.........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==4 || i==7 || j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        30.....//////////////////...............////////////////............../////////////................
//        pattern of letter F..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==4  || j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        31.....//////////////////...............////////////////............../////////////................
//        pattern of letter G..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==1 || j==1 || i==7)
//                {
//                    System.out.print("* ");
//                }
//                else if(j==7)
//                {
//                    if(i>=4)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//                else if(i==4)
//                {
//                    if(j>5)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//        32.....//////////////////...............////////////////............../////////////................
//        pattern of letter H..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==4 || j==1 || j==7)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        33.....//////////////////...............////////////////............../////////////................
//        pattern of letter I..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==1 || i==7 || j==4 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        34.....//////////////////...............////////////////............../////////////................
//        pattern of letter J..........

//        for(int i=1;i<=7;i++)
//        {
//
//            for(int j=1;j<=7;j++)
//            {
//
//                if(i==1 || j==4)
//                {
//
//                    System.out.print("*");
//                }
//                else if(i==7 ) {
//                    if (j <= 4) {
//
//                        System.out.print("*");
//                    }
//                }
//                else if(j==1)
//                {
//                    if(i>=5)
//                    {
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        35.....//////////////////...............////////////////............../////////////................
//        pattern of letter K..........
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=6;j>=1;j--)
//            {
//                if(i==j || j==6 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=6;i++)
//        {
//            for(int j=1;j<=6;j++)
//            {
//                if(i==j || j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        36.....//////////////////...............////////////////............../////////////................
//        pattern of letter L..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==7 || j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        37.....//////////////////...............////////////////............../////////////................
//        pattern of letter M..........
//        for (int i = 1; i <= 7; i++)
//        {
//            for (int j = 1; j <= 7; j++)
//            {
//                if (i == j || j == 1)
//                {
//                    System.out.print("*");
//                } else
//                {
//                    System.out.print(" ");
//                }
//
//            }
//            for (int k = 6; k >=1; k--)
//            {
//                if (i == k || k == 1)
//                {
//                    System.out.print("*");
//                } else
//                {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }


//        38.....//////////////////...............////////////////............../////////////................
//        pattern of letter N..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==j || j==1 || j==7)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        39.....//////////////////...............////////////////............../////////////................
//        pattern of letter 0..........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==1 ||i==7 || j==1 || j==7)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        40.....//////////////////...............////////////////............../////////////................
//        pattern of letter P.........
//       for(int i=1;i<=4;i++)
//       {
//           for(int j=1;j<=5;j++)
//           {
//               if(i==1 || i==4 || j==1 || j==5)
//               {
//                   System.out.print("*");
//               }
//               else
//               {
//                   System.out.print(" ");
//               }
//           }
//           System.out.println();
//       }
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=3;j++)
//            {
//                if( j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        41.....//////////////////...............////////////////............../////////////................
//        pattern of letter Q........
//        for(int i=1;i<=9;i++)
//        {
//            for(int j=1;j<=9;j++)
//            {
//                if(i==1 && j<=7|| i==7 && j<=7 || j==1 && i<=7 || j==7 && i<=7 )
//                {
//                    System.out.print("*");
//                }
//                else if(i>3 && j>3)
//                {
//                    if(i==j)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        42.....//////////////////...............////////////////............../////////////................
//        pattern of letter R.........
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==4 || j==1 || j==5)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if( j==1 || i==j )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        43.....//////////////////...............////////////////............../////////////................
//        pattern of letter S.........
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || i==5 || j==1 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if( j==5 || i==5 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        44.....//////////////////...............////////////////............../////////////................
//        pattern of letter T.........
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=7;j++)
//            {
//                if(i==1 ||  j==4 )
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        45.....//////////////////...............////////////////............../////////////................
//        pattern of letter U.........
//        for(int i=1;i<=6;i++)
//        {
//            for(int j=1;j<=6;j++)
//            {
//                if(i==6 || j==1 || j==6)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        46.....//////////////////...............////////////////............../////////////................
//        pattern of letter V.........
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==j)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int k=4;k>=1;k--)
//            {
//                if(i==k)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        47.....//////////////////...............////////////////............../////////////................
//        pattern of letter W........
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==j)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int k=4;k>=1;k--)
//            {
//                if(i==k)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int l=2;l<=5;l++)
//            {
//                if(i==l)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int m=4;m>=1;m--)
//            {
//                if(i==m)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        48.....//////////////////...............////////////////............../////////////................
//        pattern of letter X.........
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//                if(i==j)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int k=3;k>=1;k--)
//            {
//                if(i==k)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=4;i++)
//        {
//            for(int l=4;l>=2;l--)
//            {
//                if(i==l)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int m=1;m<=4;m++)
//            {
//                if(i==m)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        49.....//////////////////...............////////////////............../////////////................
//        pattern of letter Y.........
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//                if(i==j)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for(int k=3;k>=1;k--)
//            {
//                if(i==k)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=3;i++) {
//            for (int j = 1; j <= 4; j++) {
//                if (j == 4) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        50.....//////////////////...............////////////////............../////////////................
//        pattern of letter Z

//        for(int i=1;i<=5;i++)
//        {
//            for(int j=5;j>=1;j--)
//            {
//                if(i==j || i==1 || i==5)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }



    }
    }



