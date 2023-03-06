package Series;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;

        rotateArray(nums, k);
        
    }

    public static void rotateArray(int[] nums, int k){
        int len = nums.length;
        int[] ans = new int[len];

        for(int i=0;i<=len-1;i++)
        {
           if(i>len-1-k)
           {
               ans[i-k-1]=nums[i];
           }
           if(i<=len-1-k)
           {
               ans[i+k] = nums[i];
           }

        }
        for(int j=0;j <= len-1;j++)
        {
            System.out.print(ans[j]);
        }

    }
    
}
