import java.util.*;
class Expansion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(expand(str));
    }
    public static String expand(String str){
        StringBuilder sb=new StringBuilder();
        int i=0;
        int l=str.length();
        while(i<l){
            char c=str.charAt(i++);
            int num=0;
            while(i<l && Character.isDigit(str.charAt(i))){
                num = num*10 + (str.charAt(i++) -'0');
            }
            if(num==0) num=1;
            for(int k=0;k<num;k++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}