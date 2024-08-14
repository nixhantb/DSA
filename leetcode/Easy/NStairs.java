public class NStairs {
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a[] = new int[n+1];
       
        return  solver(n,a);

    }

    static int solver(int n, int a[]){

        if(n <= 2){
            a[n] = n;
        }
        if(a[n] != 0){
            return a[n];
        }
       

        a[n]=solver(n-1, a)+solver(n-2, a);
        return a[n];
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(climbStairs(x));
    }
}
