//HomeWork to delete all the pairs whose sum is 0
package ds.classwork;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class NodeS{
    int data;
    NodeS next;
    NodeS (int data){
        this.data=data;
    }
}
class LinkedListA{
    NodeS head;
    public void insertEnd(int data){
        NodeS node=new NodeS(data);
        if(head==null){
            head=node;
        }else{
            NodeS current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=node;
        }
    }
    
     public void traverse(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            NodeS current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
     
     public void removeSum0(){
     NodeS ptr1,ptr2,pprev;
     int flag;
     for(ptr1=head; ptr1.next!=null; )
     {
         pprev=ptr1;
         flag=0;
         for(ptr2=ptr1.next; ptr2!=null; )
         {             
             if((ptr1.data + ptr2.data)==0)
             {
                flag=1;
                break;
             }
             pprev=ptr2;
             ptr2=ptr2.next;
         }
         if(flag==1)
         {
             pprev.next=ptr2.next;
             head=ptr1.next;
           }
         else
         {
            ptr1=ptr1.next; 
         }
         
     }
}
     
}
     
public class Sum0Remove {
 public static void main(String[] x){
     LinkedListA l1=new LinkedListA();
     Scanner in=new Scanner(System.in);
     int input=in.nextInt();
     for(int i=0;i<input;i++)
     {
         l1.insertEnd(in.nextInt());
     }
  
     l1.removeSum0();
     System.out.println("The output is: ");
     l1.traverse();
 }   
}
