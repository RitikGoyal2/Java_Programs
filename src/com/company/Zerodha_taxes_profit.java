package com.company;
import java.util.Scanner;
public class Zerodha_taxes_profit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("check your all charge and net profit loss during stock market transition");
        float BT,ST,T,BRO,STT,TC,GST,SEB,STAMP,TT,TP;
        System.out.println("Enter the number of Quantity");
        boolean a = sc.hasNextInt();
       // int Q=sc.nextInt();
        if (sc.hasNextInt())
        {
            int Q=sc.nextInt();
            System.out.println("Enter the buying price");
            boolean d=sc.hasNextFloat();
            if (sc.hasNextFloat() )
            {
                float B =sc.nextFloat();
                System.out.println("Enter the selling  price");
                boolean b=sc.hasNextFloat();
                if (sc.hasNextFloat() )
                {
                    float S =sc.nextFloat();
                    BT=Q*B;
                    ST=Q*S;
                    T=BT+ST;
                    BRO=(0.03f*T)/100f;
                    STT=(0.025f*ST)/100f;
                    TC=(0.00345f*T)/100f;
                    GST=((18*(BRO+TC))/100f);
                    SEB=((0.000001f*T));
                    STAMP=(0.003f*BT)/100f;
                    TT=(BRO+STT+TC+GST+SEB+STAMP);
                    TP=(ST-(BT+TT));
                if (TP>0)
                {
                    System.out.println("your all the charges and net profit and loss ");
                    System.out.println("BROKERAGE CHARGE  "+BRO);
                    System.out.println("STT CHARGE "+STT);
                    System.out.println("TRANSITION CHARGE  "+TC);
                    System.out.println("GST CHARGE "+GST);
                    System.out.println("SEB I CHARGE "+SEB);
                    System.out.println("STAMP CHARGE "+STAMP);
                    System.out.println("TOTAL TAX AND CHARGES "+TT);
                    System.out.println("YOUR NET PROFIT OF RUPEES  "+TP);
                }
                else if(TP<0)
                    {
                        System.out.println("your all the charges and net profit and loss ");
                        System.out.println("BROKERAGE CHARGE  "+BRO);
                        System.out.println("STT CHARGE "+STT);
                        System.out.println("TRANSITION CHARGE  "+TC);
                        System.out.println("GST CHARGE "+GST);
                        System.out.println("SEB I CHARGE "+SEB);
                        System.out.println("STAMP CHARGE "+STAMP);
                        System.out.println("TOTAL TAX AND CHARGES "+TT);
                        System.out.println("YOUR NET LOSS  OF RUPEES  "+TP);


                    }
                else
                {
                    System.out.println("YOU HAVE NO LOSS AND PROFIT");
                }

                }
                else
                {
                    System.out.println("Something went wrong:");
                }

            }
            else
            {
                System.out.println("Something went wrong");
            }
        }
        else
        {
            System.out.println("you have entered something wrong :");

        }

    }
}
