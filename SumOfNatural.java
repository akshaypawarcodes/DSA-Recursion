import java.util.Scanner;

public class SumOfNatural {
    public static int sum(int n){
        System.out.println(n);
       if(n == 1)
            return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
       if(n<0){
            System.out.println("this is not a natural number");
        }
        else{
            System.out.println(sum(n));
        }

    }
}
