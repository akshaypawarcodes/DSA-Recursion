import java.util.Scanner;

public class check_IsSorted {
    public static boolean isSorted(int arr[], int indx){
        if(indx == arr.length-1){
            return true;
        }
        if(arr[indx]<arr[indx+1]){
            return isSorted(arr,indx+1);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(isSorted(arr,0));
    }

}
