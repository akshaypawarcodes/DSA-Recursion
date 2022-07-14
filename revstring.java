import java.util.Scanner;

public class revstring {
    public static void printrev(String str, int indx) {
        if(indx == 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printrev(str, indx-1);

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        printrev(str, str.length()-1);
    }
}