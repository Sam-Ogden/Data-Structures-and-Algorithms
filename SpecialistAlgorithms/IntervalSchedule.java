/*
    Interval Scheduling Problem
    - Given a set of jobs {{s1,f1},{s2,f2}, ...} with start times s and finish times f
    - Find a compatible set of jobs of maximum size
    - A set of jobs is compatible if Fi < Sj OR Sj < Fi
    - Greedy algorithm of Earliest Finish Time First.

    - Algo running time O(nlogn) due to merge sort
*/

import java.util.Arrays;

public class IntervalSchedule {
    
    public static void main(String[] args) {
        int[][] test = new int[][] {{6,8}, {0,9}, {1,2}, {3,4}, {1,4}};
        //should be {1,2}, {3,4}, {6,8},
        System.out.println(getOptimalSchedule(test));
    }

    //returns set of compatible jobs in string form
    public static String getOptimalSchedule(int[][] allJobs) {
        int[][] schedule = new int[allJobs.length][2];
        //Sort jobs by finish time (USE MERGE SORT for max efficiency, this is bubble sort)
        for(int i = 0; i < allJobs.length; i++) {
            for(int j = 0; j < allJobs.length; j++) {
                if(j == allJobs.length-1) break;
                if(allJobs[j][1] > allJobs[j+1][1]) {
                    int str1 = allJobs[j][0];
                    int str2 = allJobs[j][1];
                    allJobs[j][0] = allJobs[j+1][0];
                    allJobs[j][1] = allJobs[j+1][1];
                    allJobs[j+1][0] = str1;
                    allJobs[j+1][1] = str2;
                }
            }
        }
        
        //Add jobs to compatible set if curr start time < previous finish
        int scheduleNext = 0;
        for(int i = 0; i < allJobs.length; i++) {
            if(i == 0) {
                schedule[0] = allJobs[0];
                scheduleNext++;
            }
            if(schedule[scheduleNext-1][1] < allJobs[i][0]) {
                schedule[scheduleNext] = allJobs[i];
                scheduleNext++;
            }
        }

        //convert to string 
        String result = "";
        for(int i = 0; i < schedule.length; i++) {
            if(schedule[i][0] != 0 && schedule[i][1] != 0) 
                result = result + "{" + schedule[i][0] + "," + schedule[i][1] + "}, ";
        }
        return result;
    }
}