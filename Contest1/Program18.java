import java.lang.reflect.Array;
import java.util.Arrays;

public class Program18 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        moveZero(arr);
        int[] arr1 = {1, 0, 1, 0, 1, 0, 1, 0};
        moveZero(arr1);



    }

    public static void moveZero(int[] arr) {
        int count0 = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
        }
        int len = arr.length - count0;
        int j = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }   
        }
        for(int i = len;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
