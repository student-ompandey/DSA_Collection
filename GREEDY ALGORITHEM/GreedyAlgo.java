import java.util.*;
public class GreedyAlgo {

    static class Job{
        int deadLine;
        int profit;
        int id ;

        public Job(int i, int p, int d){
            id = i;
            deadLine = d;
            profit = p;
        }
    }
    public static void main(String args[]){

        //ACTIVITY SELECTION 
        // int start[] = {1, 3, 0, 5, 8, 5};
        // int end[] = {2, 4, 6, 7 ,9, 9};

        // // sorting 
        // int activities [][] = new int[start.length][3];
        //     for(int i=0;i<start.length;i++){
        //         activities[i][0] = i;
        //         activities[i][1] = start[i];
        //         activities[i][2] = end[i];
        //     }
        //     // lembda function - for sorting 2d arrays if array is not sorted we sort the arrays on this basis of end 
        //     Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // //end time basis sorted 
        // int maxAct = 0;
        // ArrayList<Integer> a = new ArrayList<>();

        // maxAct = 1;
        // a.add(activities[0][0]);
        // int lastEnd = activities[0][2];

        // for(int i=0;i<end.length;i++){
        //     if(activities[i][1]>=lastEnd){
        //         maxAct++;
        //         a.add(activities[i][0]);
        //         lastEnd = activities[i][2];
        //     }
        // }

        // System.out.println("MaxActivity = "+maxAct);
        // for(int i=0;i<a.size();i++){
        //     System.out.print("A"+a.get(i)+" ");

        // }

        //FRACTIONAl knapsack 
        // int val [] = {60, 100, 120};
        // int weight[] = {10, 20, 30};
        // int w = 50;

        // double ratio[][] = new double[val.length][2];

        // //0 -- me idx and 1--- me ratio

        // for(int i=0;i<val.length;i++){
        //     ratio[i][0] = i;
        //     ratio[i][1] = val[i]/(double)weight[i];
        // }

        // Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // int capacity = w;
        // int maxVal = 0;
        // int finalVal = 0;
        // for(int i=ratio.length-1;i>=0;i--){
        //     int idx = (int) ratio[i][0];
        //     if(capacity >= weight[idx]){  // include full item 
        //         finalVal+=val[idx];
        //         capacity -= weight[idx];
                
        //     } else {  // include fractional items 
        //         finalVal += (ratio[i][1]*capacity);
        //         capacity = 0;
        //         break;
        //     }
        // }

        // System.out.println("FinalValue = "+finalVal);



        // MINIMUM SUM OF ABSOLUTE PAIRS 
        // int A[] = {1, 2, 3};
        // int B[] = {2, 1, 3};

        // Arrays.sort(A);
        // Arrays.sort(B);
        // int minAbs = 0;
        // for(int i=0;i<A.length;i++){
        //     minAbs += Math.abs(A[i]-B[i]);
        // }
        // System.out.println("MinAbs = "+minAbs);


        // JOB SEQUENCE PROBLEM 

        // int jobInfo[][] = {{4, 20}, {1, 10},{1, 40},{1, 30}}; 

        // ArrayList<Job> jobs = new ArrayList<>();

        // for(int i=0;i<jobInfo.length;i++){
        //     jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        // }

        // Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit );

        // ArrayList<Integer> seq = new ArrayList<>();
        // int time = 0;
        // for(int i=0;i<jobs.size();i++){
        //     Job curr = jobs.get(i);
        //     if(curr.deadLine>time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }

        // System.out.println("MaxJob = "+ seq.size());
        // for(int i=0;i<seq.size();i++){
        //     System.out.print(seq.get(i)+" ");
        // }


        // CHOCOLA PROBLEM 
        int n= 4, m = 6;
        Integer costVer[] = {2, 1, 3, 4, 1};
        Integer costHer[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHer, Collections.reverseOrder());
       

        int h = 0, v = 0, vp = 1, hp = 1, cost = 0;
        while(h<costHer.length && v<costVer.length){
            if(costVer[v]<=costHer[h]){  // horizontal cut 
                cost += (costHer[h]*vp);
                hp++;
                h++;
                
            } else {  //vertical cut 
                cost+= (costVer[v]*hp);
               vp++;
               v++;
            }
        }

        while(h<costHer.length){
            cost += (costHer[h]*vp);
            hp++;
                h++;
        }

        while(v<costVer.length){
            cost+= (costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost  = "+cost);


















    }
}
