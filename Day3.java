import java.util.*;
class Day3{

    /*
    palindrome:
    String str=sc.nextLine();
        String sb=new StringBuilder(str).reverse().toString();
        if(str.equals(sb)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    
    vowels and consonants count:
        int v=0;
        int c=0;
        String str=sc.nextLine();
        int n=str.length();
        char[] arr=str.toCharArray();
        for(int i=0;i<n;i++){
            char s=arr[i];
            if(s=='a' || s=='e'||s=='i'||s=='o'||s=='u'){
                v++;
            }else{
                c++;
            }
        }
        System.out.println("vowels: " + v);
        System.out.println("Consonants: "+ c);
    
    length without builtin method:
     String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int c=0;
        for(char s: arr){
            c++;
        }
        System.out.println(c);

    duplicate array:
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){

        }



    ---------METHOD:---------

    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=add(a,b);
        System.out.println(res);
Pattern:

public static String pattern(int n){
        String arr="";
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                arr+="*";
            }
            arr+='\n';
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=pattern(n);
        System.out.println(res);

    }
    }

summ of elements in a array:
     public static int Array(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=Array(arr);
        System.out.println(res);

    }
}

nonstatic variable cannot be referencd by static method:
     int a=0;
    public static int Array(int a){
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int res=Array(a);
        System.out.println(res);

    }

static rules implementation:

    public static int Array(int a){

        return a+1;
    }
    public static int Array 1(){
        Array(int a);
        return a+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=8;
        int res=Array(a);
        System.out.println(res);
    }

reversing using method:

    public static String str(String s){
        String s1=new StringBuilder(s).reverse().toString();
        return s1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev=str(s);
        System.out.println(rev);

    }

--------RECURSION----------
    public static void count(int n){
        System.out.println(n);
        if(n<=0){
            return;
        }
        count(n-1);
    }
    public static void main(String[] args){
        int n=5;
        count(n);
        
    }

Fibonaacci :

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; 

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

     */
    
    public static void count(int n){
       
    }
    public static void main(String[] args){
        int n=10;
        count(n);
        
    }
}
