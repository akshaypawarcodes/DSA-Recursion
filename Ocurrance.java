import java.util.Scanner;

public class Ocurrance {
    public static int first=-1;
    public static int last=-1;
    public static void FindOcurrance(String str, int indx, char element){
        //base case
        if(indx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        //recursive function
       // char currChar=str.charAt(indx);
        if( str.charAt(indx)== element){
            if(first == -1){
                first =indx;
            }else {
                last=indx;
            }
        }
        FindOcurrance(str, indx+1, element);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        FindOcurrance(str, 0, 'p');
    }

}
