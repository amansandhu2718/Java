//O(n) solution to reverse linklist

public class LinkListReverse2 {
    public static void main(String[] args) {
        MyLinkList myLinkList=new MyLinkList();
        for(int i=0;i<10;i++){
            myLinkList.addLast(i);
        }
        myLinkList.display();
        Node head=myLinkList.head;

        // approach: take two pointers  prev and current
        Node prev=null;  // prev points to null
        Node current=head;// current points to head
        while(current!=null){
            Node n=current.next; //save currents next 
            current.next=prev; // point current to prev;
            prev=current; //make current the new prev. 
            current=n;// make saved currents's next the new current.
        }
        myLinkList.head=prev; // save head in original LL obj.
        myLinkList.display();
        
    }
}
