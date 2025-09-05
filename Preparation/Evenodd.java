import java.util.*;


class Evenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                odd.add(arr[i]);
            }else{
                even.add(arr[i]);
            }
        }

        Collections.sort(even);
        odd.sort(Collections.reverseOrder());

        int a=0,b=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                arr[k]=odd.get(a++);
            }else{
                arr[k]=even.get(b++);
            }
        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}