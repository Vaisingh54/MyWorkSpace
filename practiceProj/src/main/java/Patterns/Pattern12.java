package Patterns;

public class Pattern12 {

    public static void main(String[] args) {
        int n =8;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=8;j++)
            {

                if(j<=n/2-i)
                {
                    System.out.print(" ");
                }
                if(j>n/2-i && j<=n-i)
                {
                    System.out.print("*");
                }
                if(j>n-i)
                {
                    System.out.print(" ");
                }
                

            }
            System.out.println("");
        }
    }

    }
