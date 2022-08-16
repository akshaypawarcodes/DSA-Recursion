
import java.util.*;
class FibonacciSeries{
    public static int fibo(int n){
        //base case
        if(n == 1 || n == 2){
            return 1;
        }
        //recursive call
        return (fibo(n-1) + fibo(n-2));
    }
    //main function
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
