package Patterns;

public class Pattern2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        for(int i=1;i<=4;i++)
        {
            for(int j =1;j<=5;j++)
            {
                if((i ==2 && (j==2 || j==3 || j==4)) ||(i==3 && (j==2 || j==3 || j==4))){
                    System.out.print(" \t");
                    continue;
                }
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
    
}
