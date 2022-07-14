import java.util.HashSet;
import java.util.Scanner;

public class PracticeProblems{
     static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
     public static void combination(String str, int indx,String combi){
         if(indx == str.length()){
             System.out.print(combi+" ");
             return;
         }


         char currChar=str.charAt(indx);
         String mapping=keypad[currChar-'0'];
         for(int i=0; i<mapping.length(); i++)
             combination(str,indx+1,combi+mapping.charAt(i));
     }


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String str= sc.nextLine();
         combination(str,0,"");


    }

}
