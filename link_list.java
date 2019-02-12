
//Insertion in Singly link list along with printing middle element and traverse method

package ds.classwork;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Node{
    int data; //instance variable && static variable will have default value;
    Node next;
    
    Node(int data){
        this.data=data;
    }
}

//Node node=new Node(10);
class LinkedList{
    Node head;
    public void insertEnd(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }else{
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=node;
        }
    }
    
    public void insertBeg(int data){
      Node node=new Node(data);
      if(head==null)
      {
          head=node;
      }else{
          node.next=head;
          head=node;
      }
    }
    
    public void traverse(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
    public void traverseReverse(Node head){
        
        if(head==null)
        {
            return;
        }else{
            traverseReverse(head.next);
            System.out.println(head.data);
        }      
    }
    
    public void traverseAlternate(Node head){
        
//        Node current=head;
//      while(current!=null && current.next!=null)
//      {
//          System.out.println(current.data);
//          current=current.next;
//          current=current.next;
//      }

        Node f=head;
        while(f!=null)
        {
            System.out.println(f.data);
            f=f.next;
            if(f!=null)
            {
                f=f.next;
            }
        }
       
    }
    
    public void printMiddle(Node head)
    {
        Node s=head;
        Node f=head;
//        while(f.next!=null)
//        {
//            f=f.next;
//            if(f.next!=null)
//            {
//                s=s.next;
//                f=f.next;
//            }
//        }
//        System.out.println("middle: " + s.data);

           while(f.next!=null && f.next.next!=null)
           {
               s=s.next;
               f=f.next.next;
           }
           System.out.println("middle: " + s.data);
    }
    
    public void InsertPos(int pos,int data){
        Node current=head;
        Node pp=null;
        Node temp=new Node(data);
        if(pos==1)
        {
            temp.next=head;
            head=temp;
            return;
        }
        for(int i=1; i< pos-1;i++)
        {
//            pp=current;
//            current=current.next;
            if(current==null)
            {
                System.out.println("Invalid position");
                return;
            }
                current=current.next;
         }
//        temp.next=current;
//        pp.next=temp;
        temp.next=current.next;
        current.next=temp;
            
        }
    }
    
public class link_list {
    public static void main(String[] x){
//        LinkedList list= new LinkedList();
//        list.insertEnd(10);
//        list.insertEnd(20);
//        list.insertEnd(30);
//        list.insertEnd(40);
////        list.insertEnd(50);
//        
//        list.traverse();
////        list.traverseReverse(list.head);
//        System.out.println();
//        list.traverseAlternate(list.head);
//        System.out.println();
//        
//        list.printMiddle(list.head);
        
        LinkedList list2= new LinkedList();
        list2.insertBeg(10);
        list2.insertBeg(20);
        list2.insertBeg(30);
        list2.insertBeg(40);
        list2.insertBeg(50);
        
        Scanner in=new Scanner(System.in);
        int pos=in.nextInt();
        list2.InsertPos(pos,55);
        
        list2.traverse();
        
    }
    
}
