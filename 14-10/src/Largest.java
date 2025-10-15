public class Largest {
    static int largest(int [] arr){
        int largestelement = Integer.MIN_VALUE;
        for(int i : arr){
            if (i>largestelement) largestelement = i;
        }
        return largestelement;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        System.out.println("Largest element is : "+largest(arr));

    }
}
