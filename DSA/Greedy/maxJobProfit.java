package chauhan.DSA.Greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class maxJobProfit {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int[][] jobInfo = {
                {4, 20}, {1, 10}, {1, 40}, {1, 30}
        };

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); //sorting in descending order

        ArrayList<Character> jobSeq = new ArrayList<>();
        int time = 0;
        int maxProfit = 0;

        for(int i=0; i<jobs.size(); i++) {
            if(jobs.get(i).deadline > time) {
                jobSeq.add((char)(jobs.get(i).id + 65));
                maxProfit += jobs.get(i).profit;
                time++;
            }
        }

        System.out.println("Job Sequence will be as Follows:");
        for(int i=0; i<jobSeq.size(); i++) {
            System.out.print(jobSeq.get(i)+ " -> ");
        }
        System.out.println("end");
        System.out.println("Maximum Profit is = "+maxProfit);
    }
}