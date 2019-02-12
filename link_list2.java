
//Deletion in Singly link list 

package ds.classwork;

/**
 *
 * @author DELL
 */
class Node1{
    int data;
    Node1 next;
    
   Node1(int data)
   {
       this.data=data;
   }
}
class LinkedList1{
    Node1 head;
    public void insertEnd(int data){
        Node1 node=new Node1(data);
        if(head==null){
            head=node;
        }else{
            Node1 current=head;
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
            Node1 current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
     
     public void deleteBeg(){
         if(head==null){
             System.out.println("list is empty");
         }
         else{
             Node1 temp=head;
             head=temp.next;
             temp.next=null;
         }
     }
     
     public void deleteEnd()
     {
         Node1 pprev;
         Node1 current;
         if(head==null)
         {
             System.out.println("list is empty");
         }
         else{
             
             pprev=head;
             current=head;
             while(current.next!=null)
               {
                    pprev=current;
                    current=current.next;
                }
             if(pprev==current){
                 head=null;
             }
              
              pprev.next=null;
           
         }
        
         
     }
     
}
public class link_list2 {
     public static void main(String[] x){
          LinkedList1 list= new LinkedList1();
          list.insertEnd(10);
          list.insertEnd(20);
          list.insertEnd(30);
          list.insertEnd(40);
          list.insertEnd(50);  
          
          list.deleteBeg();
          list.deleteEnd();
          
          list.traverse();
     }
}
