import java.util.Scanner;
class Day1{
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       /* 
       
       1.
        int n=sc.nextInt();
        String ch="";
        for(int i=0;i<n;i++){
            ch+="*";
            System.out.println(ch);
        }

       2.
        static{
        System.out.println("Hello world");
    }

    char str ='A';
       System.out.println((int)str);
        +35 *3 +5+3-2

        int a= ~(5/2+35 *3 +5+3-2);
       System.out.println(a);




    int year=sc.nextInt();
       if(year%4==0){
        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap year");
            }else{
            System.out.println("Not a Leap year");}
        }else{
        System.out.println("Leap year");}
       }
       
       System.out.println("1.Sunday,2.Monday,3.Tuesday,4.Wednesday,5.Thursday,6.Friday,7.Saturday");
       int a=sc.nextInt();
       System.out.println("Weather: cloudy,sunny,rainy");
       String str=sc.next();
       if((a==2 || a==4 || a==6) && str.equals("cloudy") ){
            System.out.println("Can play");
        }
       else{
            System.out.println("Cannot play");
       }



       int n=sc.nextInt();
       int num=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
        }
1
12
123
1234
12345

        int n=sc.nextInt();
       int num=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
        }
1
22
333
4444
55555


        */
        int n=sc.nextInt();
        String ch="";
        for(int i=1;i<=n;i++){
            ch+=i;
            System.out.println(ch);
            ch=i+1;
        }

    }
}