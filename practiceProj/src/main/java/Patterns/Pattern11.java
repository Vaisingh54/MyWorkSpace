package Patterns;
public class Pattern11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int N = 8;
        for (int i =0; i<N/2; i++)
        {
            for (int j =0; j<=N; j++)
            {
                if (j<=i)
                {
                System.out.print("*");
                }
                if (j>i&&j<N-i-1)
                {
                    System.out.print(" ");
                }
                if (j>N-i-1)
                {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        for (int i =0; i<N/2; i++)
        {
            for (int j =0; j<N; j++)
            {
                if (j<N/2-i)
                {
                System.out.print("*");
                }
                if (j>N/2-i && j<=N/2+i)
                {
                System.out.print(" ");
                }
                if (j>=N/2+i)
                {
                System.out.print("*");
                }
             

            }
            System.out.println();
        }

        

    }
    
}
