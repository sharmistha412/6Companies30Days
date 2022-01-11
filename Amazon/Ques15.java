public class Ques15 {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        int count=M;
        int delete=N;
        Node temp=head;
        Node pre1=null,pre2=null;
        while(temp!=null){
            while(temp!=null && count-->0){
                pre1=temp;
                temp=temp.next;
            }
            while(temp!=null && delete-->0){
                pre2=temp;
                temp=temp.next;
            }
            pre1.next=temp;
            count=M;
            delete=N;
        }
    }
    
}
