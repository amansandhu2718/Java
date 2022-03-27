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
        boolean check=false;
        // check if head(which is reference of Node type of object) is null. if it is null it means there is no element in LinkList.
        if(head!=null){  
            //save node in temp so that head is not lost. check if temp(i.e. head's copy) is null if it is not, then display data and increment. (temp.next is temp's next  node's reference).
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.print(temp.data+" ------> "); // arrow is  for representation.
            }
        }else{
            check=true;
            System.out.println("linklist is empty");// if head is null that means list is empty.
        }
        if(check==false){
            System.out.print("null");
        }
        // represnting last node points to null. 
        System.out.println();//next line
    }

    /**
     * add int element in last of linklist 
     * @param val
     */
    void addLast(int val){
        Node node =new Node(); // create node
        node.data=val;//add provided data
        if(length==0){ //check if the LL is empty i.e. having atleast one node or not
            tail=head=node; //if empty this node will be our first node and it will be head and tail or linklist
        }else{   // if LL not empty  save this node's reference in tail's next and make this node tail. 
            tail.next=node; // this line means tail's next node will be this node.
            tail=node;//making this node tail
        }
        length++; // length increment because element is added
    }

    /**
     * add int element in front of linklist
     * @param val
     */
    void addFirst(int val){
        Node node =new Node();//create node
        node.data=val;//add data in node's data
       if(head!=null){//check if the LL is empty i.e. having atleast one node or not if not...
        node.next=head; //this means node's next node will be head
        head=node;    //this means this node will be head 
       }else{ //if LL is empty make this node tail and head
           tail=head=node;
       }
       length++;
       }
    
    /**
     * add int element in ad given index of linklist
     * @param index
     * @param val
     */
    void addAt(int index,int val){
       if(index==0){
            addFirst(val);
       }else if(index==length){
            addLast(val);
       }else if(index<0||index>=length){
            System.out.println("invalid index:"+index);
       }else{
            Node nm1=head;
            for(int i=0;i<index-1;i++){
                nm1=nm1.next;
            }
            Node np1=nm1.next;

            Node node=new Node();
            node.data=val;
            node.next=np1;
            nm1.next=node;
            length++;
        }
        
       }
    
    /**
     * remove first int element from linklist
     */
    void removeFirst(){
        if(length==0){
            System.out.println("linkList is already empty. !!");
        }else if(length==1){
            head=null;
            tail=null;
            length=0;
        }else{
            head=head.next;
            length--;               
        }
    }
    
    /**
     * remove last int element from linklist
     */
    void removeLast(){
        if(length==0){
            System.out.println("Linklist is empty.. !!");
        }else if(length==1){
            head=null;
            tail=null;
            length=0;
        }else{
            Node temp=head;
            for(int i=0;i<length-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            length--;
        }
    }
    
    /**
     * remove int element in ad given index of linklist
     * @param index
     */
    void removeAt(int index){
        if( index<0 || index >=length){
            System.out.println("invalid index: "+index);
        }
        else if(index==0){
            removeFirst();
        }else if(index==length-1){
            removeLast();
        }else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node temp2=temp.next.next;
            temp.next=temp2;
            length--;
        }
    }
    /**
     * function returns data value of node at given index;
     * @param index
     * @return int
     */
    int getAt(int index){
        if(head==null){
            System.out.println("Linklist is empty.");
        }
        else if(index>=length || index<0){
            System.out.println("invalid index: "+index);
        }else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        return -1;
    }
    /**
     * returns Node at given index returns -1 if invalid index.
     * @param index
     * @return Node
     */
    Node getNodeAt(int index){
        if(head==null){
                System.out.println("Linklist is empty.");
        }
        else if(index>=length || index<0){
            System.out.println("invalid index: "+index);
        }else {
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp;
        }
        Node node=new Node();
        node.data=-1;
        node.next=null;
        return node;
    }


    }
class LinkListBasics{
    public static void main(String[] args) {
        MyLinkList mylinklist=new MyLinkList();
        System.out.println("\n\n\n\n-------------------------- ADD & DISPLAY Methods to add and display Elements in LinkList -------------------------- \n\n");
        for(int i=1;i<=5;i++){
            mylinklist.addLast(i);// insertion using forloop
        }
       
        mylinklist.addFirst(0);//normal insertion using function call
        for(int i=1;i<=5;i++){
            mylinklist.addFirst(i);// reverse insertion using forloop
        }
        mylinklist.display();
        mylinklist.addAt(0,12345);
        mylinklist.addAt(3,33333);
        mylinklist.addAt(99,33333);
        mylinklist.display();
        System.out.println("\n length of my linklist is: "+mylinklist.length);
        System.out.println("\n\n\n\n-------------------------- REMOVE  Methods to remove elements from LinkList ---------------------------------------\n");
        System.out.println("length of my linklist is: "+mylinklist.length);
        mylinklist.display();
        int x=mylinklist.length;
        x=x-7;
        for(int i=0;i<x;i++){ 
            mylinklist.removeFirst();
        }
        System.out.println("\n length of my linklist is: "+mylinklist.length);
        mylinklist.display();
        System.out.println("removing from last... ");
        mylinklist.removeLast();
        mylinklist.display();
        System.out.println("removing element at  ... ");
        mylinklist.removeAt(55);
        mylinklist.display();
        System.out.println("\n\n\n\n-------------------------- Get at Methods to get data from LinkList ---------------------------------------\n");
        System.out.println("int returned by function: "+mylinklist.getAt(4));
        Node temp=mylinklist.getNodeAt(0);
        System.out.println("int of node returned by function: "+temp.data);        
    }
}