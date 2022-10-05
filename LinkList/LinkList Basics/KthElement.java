public class KthElement {
    public static void main(String[] args) {
        MyLinkList myLinkList=new MyLinkList();
        for(int i=0;i<12;i++){
            myLinkList.addLast(i);
        }
        myLinkList.display();
        Node slow=myLinkList.head;
        System.out.println("slow:"+slow.data);
        Node fast=myLinkList.head;
        int k=3;//assume k is always correct
        /*  
        if k =3 and, 
        LL =  0 ------> 1 ------> 2 ------> 3 ------> 4 ------> 5 ------> 6 ------> 7 ------> 8 ------> 9 ------> 10 ------> 11 ------> null
        then,  kth element from back will be 8 
        */
        for(int i=0;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println("kth node is : "+slow.data);
    

    }
}
