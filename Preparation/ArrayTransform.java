import java.util.*;
public class ArrayTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(arr[i]!=0 && arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }
        }
        int[] result = new int[n];
        int idx=0;
        for(int a: arr) if(a!=0) result[idx++]=a;
        while(idx<n) result[idx++]=0;
        for(int a: result) System.out.print(a+" ");
    }
}
