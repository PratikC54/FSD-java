public class Smallest {
    static int smallest(int [] arr){
        int smallestelement = arr[0];
        for (int i : arr){
            if (i<smallestelement) smallestelement = i;
        }
        return smallestelement;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        System.out.println("Smallest element is : "+smallest(arr));
    }
}
