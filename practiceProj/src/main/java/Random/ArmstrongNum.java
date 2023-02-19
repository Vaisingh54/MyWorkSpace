package Random;
public class ArmstrongNum{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 153,ans=0,i,real=n;
        

        while(n!=0)
        {
            i = n%10;
            ans = ans + i*i*i;
            n = n/10;
            
        }
        if(real==ans)
        System.out.println("Is Armstrong");
        else
        System.out.println("Not armstrong");
        
    }
}