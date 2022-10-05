public class MergeSortLL {
    public static void main(String[] args) {
        
        MyLinkList linkList=new MyLinkList();
      
        for(int i=0;i<=5;i++){
            linkList.addLast(i);
        }
        linkList.addAt(1, 6);
        linkList.addAt(3, 8);
        linkList.addLast(2);
        linkList.display();
        MyLinkList sorted= SortLinkedList(linkList,linkList.head,linkList.tail);
        sorted.display();
    }
    public static  MyLinkList SortLinkedList(MyLinkList linkList,Node st,Node end){
        if(st==end){
            MyLinkList bList=new MyLinkList();
            bList.addLast(st.data);
            return bList;
        }
       Node mid=MidPoint(st,end);
       MyLinkList fsh=SortLinkedList(linkList, st,mid);
       MyLinkList ssh=SortLinkedList(linkList, mid.next,end);
        MyLinkList sorted=mergeTwoLL(fsh,ssh);
        return sorted;

    }

    public static Node MidPoint(Node head, Node tail){
        Node slow=head;
        Node fast=head;
        for(Node temp=fast;temp.next!=tail && temp.next.next!=tail   ;temp=temp.next.next){
            slow=slow.next;
        }
        return slow;
    } 
     
    public static  MyLinkList mergeTwoLL(MyLinkList linkList1,MyLinkList linkList2){
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

            // linkList3.display(); //display new LL

        return linkList3;


    }
}
