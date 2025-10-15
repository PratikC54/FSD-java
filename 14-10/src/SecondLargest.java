public class SecondLargest {
    static int secondLargest(int[] arr)
    {                          // TC-: O(n)
        if(arr.length<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > large) {
                secondlarge = large;
                large = i;
            } else if (i > secondlarge && i != large) {
                secondlarge = i;
            }
        }
        return secondlarge;


        /*
//        This leads the time complexity to O(n log n)
        Arrays.sort(arr);
        return arr[arr.length-2];
         */

    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        System.out.println("SecondLargest element is : "+secondLargest(arr));
    }
}
