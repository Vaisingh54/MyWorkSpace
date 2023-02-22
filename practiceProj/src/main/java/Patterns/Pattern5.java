package Patterns;

public class Pattern5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
       int n =3;
        for(int i=1;i<=4;i++)
        {

            for(int j =1;j<=4;j++)
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
