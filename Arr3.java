//Minimum value in Array
public class Arr3{
    public int findMiniValue(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Arr3 ar= new Arr3();
        int[] arre= {10, 4, 6, 7, 2, 1};
        System.out.println(ar.findMiniValue(arre));
    }
}