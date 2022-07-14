import java.util.Scanner;

public class MoveAll {
    public static void MoveAllx(String str, int indx, int count, String newString){

        if(indx == str.length()){
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;

        }
        char currChar = str.charAt(indx);
        if(currChar == 'x'){

            MoveAllx(str, indx+1, count+1, newString);
        }else {
            newString += currChar;
            MoveAllx(str, indx+1,count, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        MoveAllx(str, 0, 0, " ");
    }
}
