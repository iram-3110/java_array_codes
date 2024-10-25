//Reverse array
public class Arr2{
    public int[] reverseArray(int[] arr){
        
        int[] revArr = new int[arr.length];
        int n= arr.length-1;
        for(int i=0; i<arr.length; i++){
            revArr[i]= arr[n-i];
        }

        return revArr;
    }
    public static void main(String[] args){
        Arr2 ar= new Arr2();
        int[] are= {2,4,6,8,10};
        Arr1.printArr(are);
        System.out.println();
        Arr1.printArr(ar.reverseArray(are));
    }
}