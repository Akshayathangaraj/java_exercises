import java.util.*;
class Day2{

/* 

int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int prod=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                sum+=arr[i];
            }else{
                prod*=arr[i];
            }
        }
        System.out.println(sum);
        System.out.println( prod);
        

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print (arr[i]+ " ");
        }
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] [] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    Linear search:
    int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j] ==target){
                System.out.println(j);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Not found");
            
        }


    Bubble sort:

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


    sorting using builtin method:
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


    int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int mid=0;
        
        while(left<=right){
            mid=left + (right - left) / 2;
            if(arr[mid]==target){
                System.out.println(target +"found in "+mid);
                return;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

    Remove duplicate elements:
        int n=sc.nextInt();
        int[] arr=new int[n];
        int [] arr1;
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }Arrays.sort(arr );
        System.out.print(arr[0]+ " ");
        for(int i=1;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
            System.out.print(arr[i+1]+ " ");
            }
            
        }
pending:
int n=sc.nextInt();
        int[] arr=new int[n];
        int [] arr1;
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int mid=n/2;

    String s1="Kamaraj";
        String s2=new String("college");
        String s3=new String("Engineering");
    System.out.println(s1);
        System.out.println(s2.length());
        System.out.println(s1.concat(s2));
        System.out.println(s3.concat(s2));
        System.out.println(s1 + " " +s2);
        System.out.println(s1.startsWith("k"));


StringBuffer:
         StringBuffer sb=new StringBuffer("Java");
        StringBuffer sb1=new StringBuffer("Programming");
        System.out.println(sb.capacity());
        System.out.println(sb.append(sb1));
        System.out.println(sb.insert(0,"The"));
        System.out.println(sb1.delete(0,4));
        System.out.println(sb1.reverse());
        */

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] str1=str.toCharArray();
        String rev="";
        for(int i=str1.length-1;i>=0;i--){
            rev+=str1[i];
        }System.out.println(rev);

    }
}