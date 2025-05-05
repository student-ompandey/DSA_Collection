
import java.util.Scanner;

public class FunctionsPS {

    //  PROBLEM NUMBER - 2
    public static boolean isEven (int n){
        if(n%2==0){ 
            return true;
        } else {
            return false;
        }
    }

    //PROBLEM NUMBER - 3
    // public static boolean isPalindrome(int num){
    //     int  myNumber = num;
    //     int reverse = 0;
    //     int lastDigit = 0;
    //     while(myNumber>0){
    //         lastDigit = myNumber % 10;
    //         reverse = (reverse*10)+lastDigit;
    //         myNumber = myNumber/10;
    //     }
    //     if(num==reverse){
    //         return true;
    //     } else{
    //         return false;
    //     }
    // }

    // public static int avgOfThreeNumber(int a, int b, int c){
    //     int avg = (a+b+c)/2;
    //     return avg;
    // }

    //PROBLEM NUMBER - 5
    public static int sumOfDigit(int n){
        int myNum = n;
        int sumofdigit = 0;
        int lastdigit;

        while(myNum>0){
            lastdigit = myNum % 10;
            sumofdigit+=lastdigit;
            myNum = myNum/10;
        }
        return sumofdigit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PROBLEM NUMBER- 2
        // System.out.println("Enter the number : ");
        // int n = sc.nextInt();
        // if(isEven(n)){
        //     System.out.println("n is even");
        // } else{
        //     System.out.println("n is odd");
        // }

        //PROBLEM NUMBER 3
        // System.out.println("Enter the number :");
        // int n = sc.nextInt();
        // if(isPalindrome(n)){
        //     System.out.println("Number : "+ n +" is Palindrom");
        // } else {
        //     System.out.println("Numer : "+ n +" is not Palindrom");
        // }

        //PROBLEM NUMBER - 1
        // System.out.println("Enter the first number :");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number :");
        // int b = sc.nextInt();
        // System.out.println("Enter the third number :");
        // int c = sc.nextInt();
        // System.out.println("The avg of these numbers is : "+avgOfThreeNumber(a, b, c));


        //QUESTION NUMBER - 5
        // System.out.println("Enter the integer : ");
        // int n = sc.nextInt();
        // System.out.println("The sum of the digits in inter = " +sumOfDigit(n));





    }
}
