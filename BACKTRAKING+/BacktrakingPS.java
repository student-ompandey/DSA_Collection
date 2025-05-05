import java.util.*;
public class BacktrakingPS {
    public static void print(int sr, int sc, int er, int ec, String s, int maze[][], ArrayList<String> path ){
        if(sr>er || sc>ec){
            return;
        }
        if(sr==er&&sc==ec){
            path.add(s);
            return;
        }
        if(maze[sr][sc]==0) return;

        //recursion 
        //right 
        print(sr, sc+1,er, ec, s+"R", maze,path);

        //down
        print(sr+1, sc, er, ec, s+"D", maze, path);
    }

    //KINGTH TOOR CONFIGRATION LEETCODE 
    public static void kingth(){
        
    }
    public static void main(String [] args){
        //RAT IN MAZE 
        int row =4;
        int col = 4;
        int maze[][] = {{1,0,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        ArrayList<String> path = new ArrayList<>();
        print(0,0,row-1,col-1,"",maze, path);

        //print all path
        for(String p : path){
            System.out.println(p);
        }


       

        
        
    }
}
