package GreedyAlgo;

import java.util.Arrays;

class Job {
    int id;
    int deadline;
    int profit;

    public Job(int id , int deadline , int profit) {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
public class JobSequence {
    public static void main(String[] args) {
        Job[] jobs = {new Job(1,2,80),
                    new Job(2,1,100),
                    new Job(2,2,70),
                    new Job(2,3,90)
                    };
        Arrays.sort(jobs,(a,b)->b.profit - a.profit);
        boolean[] slot = new boolean[jobs.length];
        int[] result = new int[jobs.length];
        int totalProfit=0;

        for(int i=0;i<jobs.length;i++) {
            for (int j=Math.min(jobs.length, jobs[i].deadline)-1;j>=0;j--){
                if(!slot[j]) {
                    slot[j]=true;
                    result[j]=jobs[j].id;
                    totalProfit+=jobs[i].profit;
                    break;
                }
            }
        }
        System.out.print("GreedyAlgo.Job sequence : ");
        for(int i : result) System.out.print(i+" ");
        System.out.println("\nTotal profit : "+totalProfit);
    }
}
