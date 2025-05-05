
import java.util.Scanner;


public class Functions {
    public static void printHello(){
        System.out.println("Hello Om Pandey");
    }
    public static int calculateSum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static void changeValue(int a, int b){
        int temp = a;
         a = b;
         b = temp;
    }

    public static int  multiply(int a, int b){
        int product = a * b;
        return product;
    }
    //factorial function
    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static int bioCo(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCo = fact_n/(fact_r*fact_nmr);
        return binCo;
    }

    //function overloading by parameters
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    //function overloading using datatypes
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static float sum(float a, float b){
    //     return a+b;
    // }
    //PRIME OR NOT A PRIME
    // public static boolean prime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++){
    //         if(i%2==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //PRIME OR NOT A PRIME BY USING SECOND METHODS 
    public static boolean prime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //PRIME IN RANGE
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        
        }
        System.out.println();
    }

    //BINARY TO DECIMAL
    // public static void binToDec(int binNum){
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum = 0;
    //     while(binNum>0){
    //         int lastDigit = binNum % 10;
    //         decNum = decNum +(lastDigit * (int) Math.pow(2, pow));
    //         pow++;
    //         binNum = binNum/10;
    //     }
    //     System.out.println("decimal of " + myNum +" = "+ decNum);

    // }

    //DECIMAL TO BINARY

    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum>0){
            int rem = decNum%2;
             binNum = binNum + (rem * (int) Math.pow(10, pow));
             pow++;
             decNum = decNum / 2;
        } 
        System.out.println("Binary of " + myNum +" = "+ binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("The sum = " +sum);

        //SWAPING TWO NUMBERS 
        // int a = 4;
        // int b = 5;
        // changeValue(a, b);
        // System.out.println(a);
        // System.out.println(b);

        //MULTIPLYING TWO NUMBERS 
        // int a = 3;
        // int b = 2;
        // int p = multiply(a, b);
        // System.out.println(p);
        // System.out.println(multiply(3, 9));


        //FACTORIAL OF A NUMBER 
        // System.out.println(factorial(3));
        // System.out.println(factorial(5));

        //BINOMIAL COFFICIENT
        // System.out.println(bioCo(5, 2));


        //function overloading by parameters
        // System.out.println(sum(2, 3));
        // System.out.println(sum(2, 2, 3));

        //FUNCTION OVERLOADING USING DATATYPES
        // System.out.println(sum(2, 6));
        // System.out.println(sum(2.2f, 2.2f));

        //PRIME OR NOT A PRIME
        // System.out.println(prime(2));

        //PRIME IN RANGE
        //primeInRange(20);

        //BINARY TO DECIMAL
        // binToDec(101);

        //DECIMAL TO BINARY
        decToBin(5);

        








        
       
        

    }
}
