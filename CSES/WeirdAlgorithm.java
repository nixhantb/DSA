import java.util.Scanner;

public class WeirdAlgorithm{
    static void result(long n){
        System.out.print(n);
        while(n > 1){
            
            if(n %2 ==0){
                n = n/2;
            }
            else {
                n = n * 3 + 1;
            }
            System.out.print(" "+n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        result(x);
        
    }
}