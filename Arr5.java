//Move Zeroes to the end without distubing the order of non zeroes
public class Arr5{
    public int[] moveZeros(int[] a){
        int n= a.length;
        int j=0; //for non zero 
        for(int i=0; i<n; i++){
            if(a[i] != 0 && a[j] ==0){
                int temp= a[i]; //swapping of non zero no with zero
                a[i]=a[j];
                a[j]=temp;
            } 
            if(a[j] != 0)
                j++;
        }
        return a;
        //mine
        // int n= arr.length;
        // int[] newAr = new int[n];
        // int idx=0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]!=0){
        //         System.out.println("--"+ arr[i]);
        //         newAr[idx]= arr[i];
        //         idx++;
                //arr[i] = arr[i+1];//a[0]=a[1]..a[n-1]=a[n]
                // System.out.println("--"+ arr[i]);
                
        //     }
        // }
        // return newAr;
    }

    public static void main(String[] args){
        Arr5 ar= new Arr5();
        int[] arr={0,1,0,4,12};
        Arr1.printArr(ar.moveZeros(arr));
    }
}