public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        
//creating 2 linkedlists and adding data
MyLinkList linkList1=new MyLinkList();
for(int i=1;i<=10;i++){
    if(i%2==0){
        linkList1.addLast(i);
    }
}
MyLinkList linkList2=new MyLinkList();
for(int i=5;i<=15;i++){
    if(i%2!=0){
        linkList2.addLast(i);
    }
} 
linkList1.addAt(3, 7);
linkList1.display();
System.out.println();
linkList2.display();

// logic for merging two linkedlist
MyLinkList linkList3=new MyLinkList(); ///create new Linkedlist
Node n1=linkList1.head;  // take one pointer on first element of linked 1
Node n2=linkList2.head;  // take one pointer on first element of linked 2

while(n1!=null && n2!=null){    //using loop add smaller element in new LL and increment pointer
    if(n1.data>n2.data){
        linkList3.addLast(n2.data);
        n2=n2.next;
    }else if( n1.data<n2.data){
       linkList3.addLast(n1.data);
       n1=n1.next;
    }else{
        linkList3.addLast(n2.data);
        n2=n2.next;
        linkList3.addLast(n1.data);
        n1=n1.next;
    }
}
    if(n1==null){ // if elements of 1st linked list is finished add elements of 2nd if left 
        while(n2!=null){
            linkList3.addLast(n2.data);
            n2=n2.next;
        }
    }
    if(n2==null){// if elements of 2nd linked list is finished add elements of 1st if left 
        while(n1!=null){
            linkList3.addLast(n1.data);
            n1=n1.next;
        }
    }

linkList3.display(); //display new LL




    }
}
