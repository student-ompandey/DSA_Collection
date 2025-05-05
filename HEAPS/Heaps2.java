import java.util.*;
public class Heaps2 {
    // static class Point implements Comparable<Point>{
    //     int x;
    //     int y;
    //     int disSq;
    //     int idx;
    //     public Point(int x, int y, int disSq, int idx){
    //         this.x = x;
    //         this.y = y;
    //         this.disSq = disSq;
    //         this.idx = idx;
    //     }

    //     @Override
    //     public int compareTo(Point p2){
    //         return this.disSq - p2.disSq;  // Asending Order
    //     }

    //Soilder question
    // static class Row implements Comparable<Row>{
    //     int soilder;
    //     int idx;

    //     public Row(int soilder, int idx){
    //         this.soilder = soilder;
    //         this.idx = idx;
    //     }

    //     @Override
    //     public int compareTo(Row r2){
    //         if(this.soilder == r2.soilder){
    //             return this.idx - r2.idx;
    //         } else {
    //             return this.soilder-r2.soilder;
    //         }
    //     }
    // }

    //window sliding problem 
    static class Pair implements Comparable<Pair>{
        int value;
        int idx;

        public Pair(int value, int idx){
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            // sorting in the decending order 
            return p2.value-this.value;
        }

    }

    public static void main(String[] args){
        // int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        // int k = 2;

        // PriorityQueue<Point> pq = new PriorityQueue<>();

        // for(int i=0;i<pts.length;i++){
        //     int disSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
        //     pq.add(new Point(pts[i][0], pts[i][1], disSq,i));
        // }

        // //nearest k cars 
        // for(int i=0;i<k;i++){
        //     System.out.println("C"+ pq.remove().idx);
        // }

        
        //JOINTS N ROPES OF MINIMUM COST
        // int ropes[] = {2, 3, 3, 4, 6};
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i=0;i<ropes.length;i++){
        //     pq.add(ropes[i]);
        // }

        // int cost = 0;
        // while(pq.size()>1){
        //     int min = pq.remove();
        //     int min2 = pq.remove();
        //     cost += min+min2;
        //     pq.add(min+min2);
        // }
        // System.out.println("Cost of connecting N ropes :"+cost);


        //SOLDIER QUESTION 
        // int army[][] = {{1, 0, 0, 0},
        //                 {1, 1, 1, 1},
        //                 {1, 0, 0, 0},
        //                 {1, 0, 0, 0}};

        // int k = 2;
        // PriorityQueue<Row> pq = new PriorityQueue<>();
        
        // for(int i=0;i<army.length;i++){
        //     int count = 0;
        //     for(int j=0;j<army[0].length;j++){
        //         count += army[i][j] == 1 ? 1 : 0;
        //     }
        //     pq.add(new Row(count, i));
        // }

        // for(int i=0;i<k;i++){
        //     System.out.println("R"+pq.remove().idx);
        // }

        //SLIDING WINDOW MAXIMUM 
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length-k+1]; //n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //first window
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().value;

        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().value;
        }

        //print result 
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }



    }
}

