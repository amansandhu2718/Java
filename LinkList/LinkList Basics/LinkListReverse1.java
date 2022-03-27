//  ***Note: this java file uses classes Node and MyLinklist from LinklistBasics.java file***
 class LinkListReverse1 {
    public static void main(String[] args) {
        System.out.println("*************************************************************************************\n\n");
        MyLinkList myLinkList=new MyLinkList();
        for(int i=0;i<11;i++){
            myLinkList.addLast(i);
        }
        myLinkList.display(); // filled data
       
        int length=myLinkList.length;
        int low=0;
        int high=length-1;
        while(low<high){ // Logic: get node at low and high and swap data
            Node left=myLinkList.getNodeAt(low); //getnodeat if function of Mylinklist class
            Node right=myLinkList.getNodeAt(high);
             int temp=left.data;
             left.data=right.data;
             right.data=temp;
            low++;
            high--;
        }
        myLinkList.display();




        System.out.println("\n\n*************************************************************************************");
    }
    
}
