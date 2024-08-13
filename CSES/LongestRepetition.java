import java.util.Scanner;

public class LongestRepetition {
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();

         // set of strings

         // longest ___ATTCGGGA
         // 3
         
         int sum = 1;
         int m = 1;
         char k = s.charAt(0);
         for(int i=1; i < s.length(); i++){

            
            if(s.charAt(i) == k){
                sum++;
                m = Math.max(sum, m);
            }
            else{
                sum=1;
            }
           
           
            k = s.charAt(i);
            


         }
         System.out.println(m);
     }
}
