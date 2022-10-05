public class MidElement {
    public static void main(String[] args) {
        MyLinkList linkList=new MyLinkList();

        for (int i = 0; i <=6; i++) {
            linkList.addLast(i);
        }
        linkList.display();
        Node slow=linkList.head;
        Node fast=linkList.head;
        for(Node temp=fast;temp.next.next!=null && temp.next!=null  ;temp=temp.next.next){
            slow=slow.next;
        }
        System.out.println(slow.data);
        

    }
}
