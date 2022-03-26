class Node{
    int data=0;
    Node next=null;
}
class MyLinkList{
    Node head;
    Node tail;
    int length;
    /**
     * Display all elements of linklist
     */
    void display(){
        if(head!=null){
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.println(temp.data);
            }
        }else{
            System.out.println("linklist is empty");
        }
    }

    /**
     * add int element in last of linklist 
     * @param val
     */
    void addLast(int val){
        Node node =new Node();
        node.data=val;
        if(length==0){
            tail=head=node;
        }else{
            tail.next=node;
            tail=node;
        }
        length++;
    }

    /**
     * add int element in front of linklist
     * @param val
     */
    void addFirst(int val){
        Node node =new Node();
        node.data=val;
       if(head!=null){
        node.next=head;
        head=node;        
       }else{
           tail=head=node;
       }
       length++;
       }
}
class Main{
    public static void main(String[] args) {
        MyLinkList mylinklist=new MyLinkList();
        for(int i=1;i<=10;i++){
            mylinklist.addLast(i);// insertion using forloop
        }
        mylinklist.addFirst(0);//normal insertion using function call
        for(int i=1;i<=10;i++){
            mylinklist.addFirst(i);// reverse insertion using forloop
        }
        mylinklist.display();
        System.out.println("length of my linklist is: "+mylinklist.length);
    }
}