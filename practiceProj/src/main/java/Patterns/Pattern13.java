package Patterns;

public class Pattern13 {

    public static void main(String[] args) {

        for ( int i = 1; i<=5; i++)
        {

            for(int j=1;j<=9;j++)
            {
                if(j<=5-i)
                {
                    System.out.print(" ");
                }
                if(j>5-i && j<5+i)
                {
                    if(i%2==0)
                    {
                        if(j%2 != 0)
                        {
                            System.out.print(" ");
                        }
                        if(j%2 == 0)
                        {
                            System.out.print(i);
                        } 
                    }
                    if(i%2!=0)
                    {
                        if(j%2 != 0)
                        {
                            System.out.print(i);
                        }
                        if(j%2 == 0)
                        {
                            System.out.print(" ");
                        }  
                    }
                    
                }
                if(j>=5+i)
                {
                    System.out.print(" ");
                }
                 
            }
            System.out.println("");

        }
           
        }
    
}
