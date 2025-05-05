

public class Strings {
    // public static void printletters(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i)+" ");
    //     }
    //     System.out.println();
    // }

    //PALINDROME STRING 
    // public static boolean isPalindrome(String str){
    //     if(str==" "){
    //         return true;
    //     }
    //     for(int i=0;i<str.length()/2;i++){
    //         int n = str.length();
    //         if(str.charAt(i)!=str.charAt(n-1-i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //GET SORTEST PATH 
    // public static float sortestPath(String path){
    //     int x = 0, y = 0;
    //     for(int i=0;i<path.length();i++){
    //         int dir = path.charAt(i);
    //         //north
    //         if(dir=='N'){
    //             y++;
    //         }
    //         //south
    //         else if(dir=='S'){
    //             y--;
    //         }
    //         //west
    //         else if(dir=='W'){
    //             x--;
    //         }
    //         //east
    //         else{
    //             x++;
    //         }
    //     }
    //     int X2 = x*x;
    //     int Y2 = y*y;
    //     return (float)Math.sqrt(X2+Y2);
    // }

    //SUBSTRING 
    // public static String subString(String str, int si, int ei){
    //     String substr = "";
    //     for(int i=si;i<ei;i++){
    //         substr+=str.charAt(i);
    //     }
    //     return substr;
    // }


    //CONVERT UPPER CASE FOR EACH WORD WHICH IS INCLUDE IN STRIGN 
    // public static String toUpperCase(String str){
    //     StringBuilder sb = new StringBuilder();
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for(int i=1;i<str.length();i++){
    //         if(sb.charAt(i-1)==' ' && i<str.length()){
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         } else{
    //             sb.append(str.charAt(i));
    //         }
    //     } 

    //     return sb.toString();
    // }

    //STRING COMPRESSION  
    public static String compression(String str){
        String newString = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newString+=str.charAt(i);
            if(count>1){
                newString += count.toString();
            }

        }
        return newString;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name ;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Om Pandey";
        // System.out.println(fullName.length());

        //Concatanation 
        // String firstName = "om";
        // String lastName  = "Pandey";
        // String fullName = firstName+" "+lastName;
        // printletters(fullName);

        // PALINDROME STRING 
        // String str = "";
        // System.out.println(isPalindrome(str));

        // Sortest path 
        // String path = "WNEENESENNN";
        // System.out.println(sortestPath(path));



 
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1==s2){
        //     System.out.println("s1 and s2 are equal");
        // } else{
        //     System.out.println("s1 and s2 are not equal");
        // }

        // if(s1==s3){
        //     System.out.println("s1 and s3 are equal");
        // } else{
        //     System.out.println("s1 and s3 are not equal");
        // }

        // if(s1.equals(s3)){ // this method use to cheack different strings that the value is same or not
        //     System.out.println("s1 and s3 are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        //SUBSTRING 
        // String str = "Hello World";
        // System.out.println(subString(str, 0, 5));
        //System.out.println(str.substring(0, 5));

        //PRINT LARGEST STRING 
        // String fruit [] = {"apple", "banana", "mango"};
        // String largest = fruit[0];
        // for(int i=0;i<fruit.length;i++){
        //     if(largest.compareTo(fruit[i])<0){
        //         largest = fruit[i];
        //     }
        // }
        // System.out.println(largest);

        //STRING BULDER 
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        //CONVERT FIRST LETTER TO UPPER CASE 
        // String str = "hi, i am shradha";
        // System.out.println(toUpperCase(str));


        //STRING COMPRESSION 
        String str = "aaabbccdd";
        System.out.println(compression(str));









    }
}
