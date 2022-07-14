import java.util.Scanner;

public class PowerOf {
    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int temp= power( x,n/2);
        if(n%2 == 1){
            return temp*temp*x;
        }
        return temp*temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int n= sc.nextInt();

        System.out.println(power(x,n));
    }
}
