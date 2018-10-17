
package javaapplication1;


public class Queue {
    int front;
    int rear;
    int capacity=5;
    int size;
    int queue[]=new int[capacity];
    
    
    public void enQueue(int data){
        
        if(!isFull()){
        queue[rear]=data;
        rear=(rear+1)%5;
        size++;
        }
        else{
        System.out.println("Queue is full");
        }
    }
    
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
               }
    
    public int deQueue(){
        int data=queue[front];
       if(!isEmpty()){ front=(front+1)%5;
       size--; }
       else {System.out.println("Queue is epmty");}
        return data;
    
    }
    public int size(){
        return size ;
    }
    
    public boolean isEmpty(){
        return size()==0;
        
    }
    
    public boolean isFull(){
        return size()==capacity;
    }
   
    }
    
    

