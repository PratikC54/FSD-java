package GreedyAlgo;

import java.util.Arrays;

public class SJF {
    public static float avgWaitTime(int[] bt) {
        int[]p = bt.clone();
        Arrays.sort(bt);
        int totalTime=0;
        int waitTiime =0;
        for(int i : bt) {
            waitTiime+=totalTime;
            totalTime+=i;
        }
        processSequence(p,bt);
        return waitTiime/ bt.length;
    }
    public static void processSequence(int[] p , int[] bt) {
        System.out.print("Process sequence is :");
        for(int i =0;i< p.length;i++) System.out.print("  P"+(processSearch(p,bt[i])));
    }

    static int processSearch(int[] arr, int target) {
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) index=i+1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] bt = {4, 1, 3, 7, 2};
        System.out.println("\nAvarage waiting time : "+avgWaitTime(bt));
    }
}
