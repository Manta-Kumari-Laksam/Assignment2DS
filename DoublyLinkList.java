
//Insertion and deletion in doubly link list
package ds.classwork;

import java.util.Scanner;

class NodeD{
    int data;
    NodeD prev,next;
    NodeD(int data){
        this.data=data;
    }
}
class DoubleLinkList{
    NodeD head;
    NodeD tail;
    
    public void traverseFwd(){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            NodeD current=head;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    public void traverseBwd(){
        if(head==null)  //tail==null
        {
            System.out.println("List is empty");
        }
        else
        {
            NodeD current=tail;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.prev;
            }
        }
    }
    
    public void insertbeg(int data){
        NodeD temp=new NodeD(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
    }
    
    public void insertend(int data){
        NodeD temp=new NodeD(data);
         if(head==null){
            head=temp;
            tail=temp;
        }else{
             temp.prev=tail;
             tail.next=temp;
             tail=temp;             
         }
    }
    

    
    public void deleteBeg(){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head.next.prev=null;
            head=head.next;
        }
    }
    
    public void deleteEnd(){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(tail.prev==null){
            head=null;
            tail=null;
        }
        else{
            tail.prev.next=null;
        }
    }
}
public class DoublyLinkList {
    public static void main(String[] x){
        DoubleLinkList l1=new DoubleLinkList();
        l1.insertbeg(50);
        l1.insertbeg(40);
        l1.insertbeg(30);
        l1.insertbeg(20);
        l1.insertbeg(10);
        l1.traverseFwd();
        System.out.println();
        l1.traverseBwd();
        
        System.out.println();
        l1.insertend(60);
        l1.traverseFwd();
        

        
         System.out.println();
         l1.deleteBeg();
         l1.deleteEnd();
        l1.traverseFwd();
    }
}
