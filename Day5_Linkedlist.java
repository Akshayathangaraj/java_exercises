class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

// to insert a element at begin
    public void insertf(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }

//to insert
    public void insert(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
// to display
    public void display(){
        if(head==null){
        System.out.println("Empty list");
    }else{
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
        }
    }

// to delete last elment
public void deletel(){
    if(head==null){
        System.out.println("Empty list");
    }else{
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.prev=null;
        temp.next=null;
        
    }
}
// to delete first element
public void deletef(){
    if(head==null){
        System.out.println("Empty list");
    }else{
        head=head.next;
    }
}
// find kth element
public void find(int k){
    if(head==null){
        System.out.print("Empty list");
    }else{
        Node temp=head;
        int count=1;
        while(temp.next!=null && count<k){
            temp=temp.next;
            count++;
        }System.out.println(temp.data);
    }
}
// to insert in middle
public void middle(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
    }else{
        Node fast=head;
        Node slow=head;
        Node previ=null;
        while(fast!=null && fast.next!=null){
            previ=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        previ.next=newnode;
        newnode.prev=previ;
        newnode.next=slow;
        slow.prev=newnode;
    }
}
// to delete middle element
public void middled(){
    if(head==null){
        System.out.println("Empty list");
    }else{
        Node fast=head;
        Node slow=head;
        Node previ=null;
        while(fast!=null && fast.next!=null){
            previ=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        previ.prev.next=slow;
        slow.prev=previ.prev;
        // previ.next=null;
        // previ.prev=null;
    }
}
// to find the total sum of elements in list
public void sum(){
        if(head==null){
        System.out.println("Empty list");
    }else{
        Node temp=head;
        int sum=0;
        while(temp!=null){
            sum=sum+temp.data;
            temp=temp.next;
        }
        System.out.println(sum);
        }
    }

// to print the prime numbers in the list
public void prime(){
        if(head==null){
        System.out.println("Empty list");
    }else{
        Node temp=head;
        int num=0;
        while(temp!=null){
            int n=temp.data;
            for(int i=2;i<Math.sqrt(n);i++){
                
                if(n%i==0){
                    break;
                }else{
                System.out.print(n +" ");
                break;
                }
            }
            temp=temp.next;
        }
        }
    }
}

class Main{
    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.insertf(10);
        l.insertf(20);
        l.insertf(30);
        l.insertf(40);
        l.display();
        l.deletel();
        l.display();
        l.deletef();
        l.display();
        l.insert(100);
        l.insert(150);
        l.insert(250);
        l.insert(13);
        l.insert(17);
        l.insert(5);
        l.insert(7);
        l.insert(1);
        l.display();
        l.find(2);
        l.middle(50);
        l.display();
        // l.sum();
        // l.prime();
        l.middled();
        l.display();
        l.middled();
        l.display();

    }
}