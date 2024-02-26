package sorting;
import java.util.*;
public class selectionsort {
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={0,6,9,4};
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=0; j<array.length-i-1;j++){
                if(array[j+1]<array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            
            
            }
        
        }printArray(array);

    }
}
