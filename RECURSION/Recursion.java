//PRINT NUMBER IN DECRESING ORDER
public class Recursion {

//print number in increasing order
public static void increasing(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    increasing(n-1);
    System.out.print(n+" ");
}

    //PRINT NUMBER IN DECRESING ORDER
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    //FACTORIAL CALCULATE 
    public static int factorial(int n ){
        if(n==0){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }

    //print sum of n natural number 
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1 = calSum(n-1);
        int sum = n+ calSum(n-1);
        return sum;
    }

    //FIBONACCI NUMBER 
    public static int fibbo(int n){
        if(n==0||n==1) return n;
       int  fibbonm1 = fibbo(n-1);
        int fibbonm2 = fibbo(n-2);
        int fibo = fibbonm1 + fibbonm2;
        return fibo;
    }

        //ARRAY IS SORTED OR NOT 
        public static boolean isSorted(int arr[], int i){
            if(i==arr.length-1) return true;
            if(arr[i]>arr[i+1]) return false;
            return isSorted(arr, i+1);
        }

        //first occurence in  array

        public static int firOccurence(int arr[], int key, int i){
            if(i==arr.length) return -1;
            if(arr[i]==key) return i;
            
            
            return firOccurence( arr , key,  i+1);
        }

        //LAST OCCURENCE IN AN ARRAY 
        public static int lastOccurence(int arr[], int key , int i){
            if(i==arr.length) return -1;
            int isFound = lastOccurence(arr, key , i+1);
            
            if(isFound!=-1) return isFound;

            //self
            if(arr[i] == key){
                return key;
            }
            return isFound;
        }

        //POWER CALCULATE USING RECURSION 
        public static int power(int base, int n){
            if(n==0) return 1;
            int power = base * power(base, n-1);
            return power;
        }
        
        //optimised powwer function 
        public static int optimizedPow(int a, int n){
            if(n==0){
                return 1;
            }
            int halfPow =  optimizedPow(a, n/2);
            int InhalfPow = halfPow*halfPow;

            if(n%2!=0){
                InhalfPow = InhalfPow*a;
            }
            return InhalfPow;
        }


        //TILING PROBLEM
        public static int tilingPro(int n ){
            if(n==0||n==1){
                return 1;
            }
            //VERTICALLY
            int ver = tilingPro(n-1);
            int hor = tilingPro(n-2);
            int total = ver + hor;
            return total;
        }

        //REMOVE DUPLICATES IN STRING 
        public static void removeRepeatChar(String str, int idx, StringBuilder newStr, boolean map[]){
            if(idx==str.length()){
                System.out.println(newStr);
                return;
            }

            //kam
            char currChar = str.charAt(idx);
            if(map[currChar-'a']==true){
                removeRepeatChar(str, idx+1, newStr, map);
            } else{
                map[currChar-'a'] = true;
                removeRepeatChar(str, idx+1, newStr.append(currChar), map);
            }
        }

        // friemd pairing problem 
        public static int friendPairing(int n){
            if(n==1||n==2){
                return n;
            }
            return friendPairing(n-1) + (n-1) *  friendPairing(n-2);
        }


        //BINARY STRING PROBLEM 
        public static void binaryStrProb(int n , String str, int lastPlace){
            if(n==0){
                System.out.println(str);
                return;
            }
            binaryStrProb( n-1 ,  str+"0",  0);

            if(lastPlace==0){
                binaryStrProb( n-1 ,  str+"1",  1);
            }
        }
  
    public static void main (String[] args){
        //decresing 
        // int n = 10;
        // printDec(10);

        //increasing 
        // int n = 5;
        // increasing(n);

        //factorial
        // int n = 5;
        // System.out.println(factorial(5));

        //calculate sum of natural numbers 
        // int n = 4;
        // System.out.println(calSum(n));

        //calculate fibbo of the number 
        // int n = 5;
        // System.out.println(fibbo(n));

        //ARRAY IS SORTED OR NOT 
        // int arr [] = {1,2,3,4,5,};
        // System.out.println(isSorted(arr, 0));

        //FIRST OCCURENCE IN ARRAY 
        // int arr [] = {1,2,3,4,5,};
        // System.out.println(firOccurence(arr, 4, 0));

         //FIRST OCCURENCE IN ARRAY 
        //  int arr [] = {1,2,3,4,5,5};
        //  System.out.println(lastOccurence(arr, 5, 0));

        //POWER CALCULATE USING RECURSION 
        // System.out.println(power(2, 10));

        // //  POWER optimized  CALCULATE USING RECURSION 
        // System.out.println(optimizedPow(2, 10));

        //tiling problem
        // System.out.println(tilingPro(4));

        //remove character in string 
        // String str = "appnnacollege";
        // removeRepeatChar(str, 0, new StringBuilder(""), new boolean[26]);


        //frieds pairing problem
        // System.out.println(friendPairing(3));

        //BINARY STRING PROBLEM 
        binaryStrProb(3, "", 0);



    }
}
