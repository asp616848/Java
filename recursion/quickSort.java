import java.util.Arrays;

//This code is self written and inefficient because dumb me created too many array objects.

public class quickSort {
    public static int[] qsort(int arr[]) {
        if(arr.length==1 || arr.length==0){
            return arr;
        }
        int l=arr.length;
        int i=0;
        int temp=0;
        int p = l/2;
        while(i<l){
            
            if (arr[i]<arr[p] && i>p){
                temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                i++;
            }
            if (arr[i]>arr[p] && i<p){
                temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                i++;
            }
            i++;
        }
        int[] left = Arrays.copyOfRange(arr, 0, p);
        int[] right = Arrays.copyOfRange(arr, p+1, l);
        left = qsort(left);
        right = qsort(right);
        System.arraycopy(left, 0, arr, 0, left.length);
        System.arraycopy(right, 0, arr, left.length + 1, right.length);
        return arr;


    }  

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 51, 32};
        int[] sortedArr = qsort(arr);
        System.out.println(Arrays.toString(sortedArr));
        Arrays.sort(arr);//inbuilt hybrid complex function
        System.out.println(Arrays.toString(arr));
    }

}