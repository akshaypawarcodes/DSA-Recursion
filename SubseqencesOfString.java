import java.sql.SQLOutput;
import java.util.Scanner;

public class SubseqencesOfString {
    public static void Subseqence(String str, int indx, String newStr){
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar =str.charAt(indx);

        //want to be
        Subseqence(str, indx+1, newStr+currChar);

        //don't want to be
        Subseqence(str, indx+1, newStr);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Subseqence(str, 0,"");
    }
}
