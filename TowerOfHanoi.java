import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n == 1) {
            System.out.println("transfer disc " + n + " from " + src + " to " + dest);
            return;
        }

        towerofHanoi(n-1, src,dest,helper);
        System.out.println("transfer disc "+n+" from "+src+" to "+dest);
        towerofHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
        towerofHanoi(n, "S","H","D");
    }
}
