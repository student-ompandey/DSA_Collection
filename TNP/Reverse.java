public class Reverse {
    public static void main (String [] args){
        int n = 121;
        int ans = n;

        int rev = 0;

        while(n!=0){
            int d = n % 10;
            rev = (rev * 10) + d;
            n = n/10;
        }

        if(ans==rev){
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
    
}
