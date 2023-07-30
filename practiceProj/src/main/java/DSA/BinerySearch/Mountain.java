package DSA.BinerySearch;

public class Mountain {

    public static void main(String[] args) {

        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        int n = mountainArr.length;
        int peak = findPeak(mountainArr,n);
        int res = findTarget(mountainArr,peak,target,true);
        if(res != -1){
          res = findTarget(mountainArr,peak,target,false);
        }
        System.out.println(res);
    }

    static int findPeak(int[] mountainArr,int n){
        int start =0,end =n-1,mid=0;
         while(start<=end)
         {
             mid = start+(end-start)/2;
 
             if(mountainArr[mid] < mountainArr[mid+1]) {
                 start = mid+1;
             }else if(mountainArr[mid-1] > mountainArr[mid]) {
                 end = mid-1;
             }else{
                 return mid;
             }
         }
         return -1;
     }
 
     static int findTarget(int[] mountainArr,int peak,int target,boolean isInc){
        if(isInc){
             int start =0,end =peak,mid=0;
 
             while(start<=end)
         {
             mid = start+(end-start)/2;
 
             if(mountainArr[mid] < target ) {
                 start = mid+1;
             }else if( mountainArr[mid] > target) {
                 end = mid-1;
             }else{
                 peak = mid;
             }
         }
        }else{
            int start =peak+1,end =mountainArr.length-1,mid=0;
 
            while(start<=end)
         {
             mid = start+(end-start)/2;
 
             if(mountainArr[mid] > target ) {
                 start = mid+1;
             }else if( mountainArr[mid] < target) {
                 end = mid-1;
             }else{
                 peak = mid;
             }
         }
        }
         
         return -1;
     }
    
}
