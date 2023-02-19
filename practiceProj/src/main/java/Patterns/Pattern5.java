package Patterns;

public class Pattern5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
       int n =4;
        for(int i=1;i<=4;i++)
        {

            for(int j =1;j<=5;j++)
            {
                if(j > n){
                    System.out.print("*\t");
                }else
                {
                    System.out.print(" \t");
                }
               
            }
            n--;
            
            System.out.println("");
        }
    }
    
}
