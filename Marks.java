import java.util.*;

class Marks{
    String name;
    int roll ;
    int[] marks;
    int total;
    int avg;

    Marks(String name,int roll,int[] marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }
    public void total(){
        for(int i=0;i<marks.length;i++){
        total+=marks[i];
        }
        System.out.println(total);
    }
    public void average(){
        avg=total/3;
        System.out.println(avg);
    }
    public void grade(){
        if(avg<=100 && avg>90){
            System.out.println("O");
        }else if(avg<=90 && avg>80){
            System.out.println("A+");
        }else if(avg<=80 && avg>70){
            System.out.println("A");
        }else if(avg<=70 && avg>60){
            System.out.println("B+");
        }else if(avg<=60 && avg>50){
            System.out.println("B");
        }else{
            System.out.println("F-");
        }
    }
    public static void main(String[] args){
        Marks s1=new Marks("Akshu",01,new int[]{90,85,95});
        Marks s2=new Marks("Gowsi",02,new int[]{97,88,96});

        s1.total();
        s1.average();
        s1.grade();
        System.out.println();
        s2.total();
        s2.average();
        s2.grade();

    }
}