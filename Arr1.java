//Remove Even
public class Arr1{
    public int[] removeEven(int[] arr){
        int countOdd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                countOdd++;
            }
        }
        int[] newArr= new int[countOdd];
        int idx=0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                newArr[idx] = arr[i];
                idx++;
            }
        }
        return newArr;

    }

    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(""+ arr[i] +",");
        }
    }

    public static void main(String[] args){
        int[] arrre = {5, 9, 10, 2 , 4 ,7 ,8 , 27, 31};
        Arr1 ar= new Arr1();
        ar.printArr(ar.removeEven(arrre));
    }
}