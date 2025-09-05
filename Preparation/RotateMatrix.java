import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j]=sc.nextInt();
        int temp=a[0][0];
        a[0][0]=a[1][0];
        a[1][0]=a[2][0];
        a[2][0]=a[2][1];
        a[2][1]=a[2][2];
        a[2][2]=a[1][2];
        a[1][2]=a[0][2];
        a[0][2]=a[0][1];
        a[0][1]=temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
