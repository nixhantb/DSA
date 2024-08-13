import java.util.Scanner;

public class IncreasingArray {
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         long s = sc.nextLong();
         long mx=0, sum=0;
         for(int i=0; i < s; i++){
            long temp = sc.nextLong();
            mx = Math.max(mx, temp);
            sum = sum + mx-temp;

         }
         System.out.println(sum);
     }
}
