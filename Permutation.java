import java.util.Scanner;

public class Permutation {
    public static void PrintPermutation(String str, String Permutation){
        if(str.length() == 0){
            System.out.print(Permutation);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            PrintPermutation(newStr, Permutation + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        PrintPermutation(str," ");
    }
}
