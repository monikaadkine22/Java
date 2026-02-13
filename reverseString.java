package Basic;
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.next();
        String rev ="";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println("Reverse String: ");
        System.out.println(rev);

    }
}
