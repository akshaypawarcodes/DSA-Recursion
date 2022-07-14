import java.util.HashSet;
import java.util.Scanner;

public class UniqeSubseqencesOfString {

    public static void UniqeSubseqence(String str, int indx, String newString, HashSet<String> set){
        if(indx == str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar= str.charAt(indx);

        //want to be
        UniqeSubseqence(str, indx+1,newString+currChar, set);

        //don't want to be
        UniqeSubseqence(str, indx+1, newString, set);

    }

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        UniqeSubseqence(str, 0, "", set);
    }
}
