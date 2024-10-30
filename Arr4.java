//Maximum value
public class Arr4{
    public int findMaxValue(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Arr4 ar= new Arr4();
        int[] arre= {10, 4, 6, 7, 2, 100};
        System.out.println(ar.findMaxValue(arre));
    }
}