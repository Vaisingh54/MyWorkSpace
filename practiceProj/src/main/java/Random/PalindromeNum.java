package Random;
public class PalindromeNum {
    public static void main(String[] args) {
       
        String ans="";
        String s = "String";
        int N = s.length();

        

        for (int i = N-1; i>=0; i--)
        {
            ans = ans+s.charAt(i);
        }
        
        System.out.println(ans);
        
        
    }
    
}
