import java.util.Scanner;

public class MissingNumber{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long a[] = new long[(int)x];
        long sum=0;
        for(int i= 0; i < x-1; i++){
            a[i] = sc.nextLong();
            sum +=a[i];
        }

        long result = x*(x+1)/2 - sum;
        System.out.println(result);
        
    }
}