public class SumOfElement {
    static int Sum (int[]arr){
        int sum=0;
        for (int i : arr) sum+=i;
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        System.out.println("Sum of elements in array is : "+Sum(arr));
    }
}
