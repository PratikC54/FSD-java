import java.util.Arrays;

public class SortArrayOF012 {
    public static void main(String[] args) {
//        int[] arr = {1,2,2,1,1,2,0,0,0,0,1,2,1,0};
        int[] arr = {0,0,0,1,1,1,0,0,1,0,1,0,1};
        int count0 = 0 , count1=0, count2 = 0 , index =0;
        for (int i : arr){
            if (i==0) count0++;
//            if (i==1) count1++;
//            if (i==2) count2++;
        }
        for (int i = 0;i< arr.length;i++) {
            if (i < count0) arr[i] = 0;
            arr[i] = 1;
        }

//        for (int i=0;i<count0;i++) arr[index++] = 0;
//        for (int i=0;i<count1;i++) arr[index++] = 1;
//        for (int i=0;i<count2;i++) arr[index++] = 2;

        System.out.println(Arrays.toString(arr));
    }
}
