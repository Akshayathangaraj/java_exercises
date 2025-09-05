import java.util.*;
public class DivisibleGroups {
    static void combine(int[] arr, int start, List<Integer> temp, int x){
        if(temp.size()>=2){
            int sum = temp.stream().mapToInt(Integer::intValue).sum();
            if(sum%x==0) System.out.println(temp);
        }
        if(temp.size()==x) return;
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            combine(arr,i+1,temp,x);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int x = sc.nextInt();
        combine(arr,0,new ArrayList<>(),x);
    }
}
