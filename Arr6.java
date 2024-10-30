// find missing value
public class Arr6{
    public int findMissing(int[] arr){
        int n= arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        n++;
        int actual= n*(n+1)/2;
        // System.out.print(n +","+ sum +","+ actual);
        return actual - sum;
    }

    public static void main(String[] args){
        Arr6 a= new Arr6();
        int[] ar={2,4,1,6,7,3,8};
        System.out.print("mising "+a.findMissing(ar));
    }
}