class CircularLinkedList{
    Node head;
    CircularLinkedList(){

    }
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=this;
        }
    }
    // to insert a element first
    public void insertf(int d){
        Node newnode = new Node(d);
        if(head==null){
            head= newnode;
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
            head =newnode;
        }
    }
    // to display an list
    public void display(){
        if(head==null){
            System.out.println("Empty list");
        }else{
            Node temp=head;
            do{
                System.out.print(temp.data +" ");
                temp=temp.next;
            }while(temp!=head);
            System.out.println();
        }
    }
    // to insert a element last
    public void insertl(int d){
        Node newnode = new Node(d);
         if(head==null){
            head= newnode;
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
        }
    }
    // to delete the first element
    public void deletef(){
        if(head == null) {
            System.out.println("Empty list");
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            head=head.next;
            temp.next=head;
        }
    }
    public void deletel(){
        if(head == null) {
            System.out.println("Empty list");
        }else{
            Node temp=head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
        }
    } 

}

class Main{
    public static void main(String[] args){
        CircularLinkedList cl= new CircularLinkedList();
        cl.display();
        cl.insertf(10);
        cl.insertf(20);
        cl.insertf(30);
        cl.display();
        cl.insertl(90);
        cl.display();
        cl.deletef();
        cl.display();
        cl.deletel();
        cl.display();
    }
}