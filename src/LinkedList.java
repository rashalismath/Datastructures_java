
package javaapplication1;


public class LinkedList {
    
        Node head;
        
        //inserting data into list
        public void insert(int data){
        
            //first we have to create the node
            Node node=new Node();
            //the data for node is inserted data , so by default its reference is null which means its added to last
           node.data=data;
           node.next=null;
           
      //if head is null it means node that is head
            if(head==null){
                head=node;
            }
            else{
                Node n =head;
                while(n.next!=null){
                    n=n.next;
                }
                n.next=node;
            }
        }
        public void show(){
            Node node=head;
            while(node.next!=null){
                System.out.println(node.data);
                node=node.next;
            }
            System.out.println(node.data);
            
        }
        
        public void insertAtStart(int data){
                
            Node node=new Node();
            node.data=data;
            node.next=null;
            
            node.next=head;
            head=node;
        
        }
        
        public void insetAt(int index,int data){
            
            Node node=new Node();
            node.data=data;
            node.next=null;
            
            if(index==0){
                insertAtStart(index);
            }
            else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                //in this code n will get the position ofexact n position
                n=n.next;
            }
            node.next=n.next;
            n.next=node;  }
            
        }
        
        public void deleteAt(int index){
            
           
            if(index==0){
                    head=head.next;
            }
            
            else{
                Node n=head;
                Node n1=null;
            for(int i=0;i<index-1;i++){
                
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("Deleted at index "+index+" Value= "+n1.data);
            n1=null;
            
            
        }
       }
    
}
