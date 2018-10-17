
package javaapplication1;


public class Stack {
        
int stack[]=new int[5];
int top=0;

        public void push(int data){

        if(top>4){
        System.out.println("Full");
        }    
        else{ stack[top]=data;
              top++;
        }            }


        public void show(){
            for(int n : stack){
                System.out.print(n+" ");
            }
            
        }
        
        public void pop(){
               if(isEmpty()){
                   System.out.println("Empty");
               }
               else{
                top--;
                stack[top]=0;
               }
        }
        
        public void peek(){
            System.out.println(stack[top-1]);
            
        }
        
        public void size(){
            System.out.println("Size is "+top);
            
        }
        public boolean isEmpty(){
            return top<=0;
        }
    
}
