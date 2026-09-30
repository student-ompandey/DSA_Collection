public class Math {
    static int fibbonacci(int n){
        if(n==0 || n ==1){
            return n;
        }
        return fibbonacci(n-1) + fibbonacci(n-2);
    }
    public static void main(String[] args){
        int n = 6;
        for(int i=0;i<=n;i++){
            System.out.println(fibbonacci(i));
        }
        

      
    }
    
}
