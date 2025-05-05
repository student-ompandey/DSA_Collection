public class RecursionPS {
    public static void increDecre(int n){
       if(n==0){
        return;
       }
        System.out.println(n);
        increDecre(n-1);
        if(n!=1){
            System.out.println(n);
        }
    }

    public static void powoFHan(int n, int a, int c, int b){ //n ko a se c le jao using b 
        if(n==0){
            return;
        }
        powoFHan(n-1, a, b , c);
        System.out.println("disk "+n+" from"+a+"to"+c);
        powoFHan(n-1, b, c, a);
    }

    // SUBSTRING PROBLEM IN PRACTICE SET 
    public static int subStr(String str,int se, int ei){
        if(se>ei){
         return 0;
        }

        int firstDecre = subStr(str, se+1, ei);
        int lastDecre = subStr(str, se, ei-1);
        int fisrLastDec = subStr(str, se+1, ei-1);
        int ans = firstDecre + lastDecre - fisrLastDec;

        if(str.charAt(se) == str.charAt(ei)){
            ans++;
        }
        return ans;
    }

    //PROBLEM NUMBER 1 
    public static void allOccurences(int arr[], int idx, int key){
        if(idx==arr.length){
            return;
        } 

        if(arr[idx] == key){
            System.out.print(idx +" ");
        }

        allOccurences(arr, idx+1, key);
    }

    // PROBLEM NUMBER - 3

    public static int stringLength(String str ){
        if(str.length()==0){
            return 0;
        }
        return stringLength(str.substring(1))+1;
    } 

    //PROBLRM NUMBER 2 
    static String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void numberToString(int n){
        if (n==0) return ;

        int LD = n%10;
        numberToString(n/10);
        System.out.print(str[LD]+" ");
    }
    public static void main (String[] args){

        // int n = 5;
        // increDecre(n);

        //POWER OF HANOE 
        // powoFHan(3, 10, 30, 20);

        //string problem 
        // String str = "bcb";
        // int n = str.length();
        // int ans = subStr(str, 0, n-1);
        // System.out.println(ans);

        //PROBLEM NUMBER 1 
        // int arr[] = {1, 2, 3, 4, 2 ,4};
        // int key = 2 ;
        // allOccurences(arr, 0, key);

        //problem number  3
        // String str = "satyam";
        // System.out.println(stringLength(str));


        // PROBLEM NUMBER 2 
        
        numberToString(123);

        

    }
}
