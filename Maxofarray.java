package Basic;
import java.util.*;
public class Maxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i=0; i<n;i++){
            max = Math.max(arr[i],arr[0]);
//            if(arr[i] >= arr[0]){
//                max = arr[i];
//            }
        }
        System.out.println(max);
        int smax = max;
        for( i=0; i<n; i++){

            if(arr[i] < max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
//        for ( i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
