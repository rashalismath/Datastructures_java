
package javaapplication1;


public class Dynamicstack {
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;

        public void push(int data){

          if(top==capacity){
              expand();
                         }  
          stack[top]=data;
          top++;
                              }
        
        public void expand(){
                int newstack[]=new int[capacity*2];
                System.arraycopy(stack, 0, newstack,0, top);
                stack=newstack;
                capacity*=2;
                                  }
        

        public void show(){
            for(int n : stack){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        
        public void pop(){
               if(isEmpty()){
                   System.out.println("Empty");
               }
               else{
                top--;
                stack[top]=0;
               }
               shrink();
               
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

         private void shrink() {
             if(top<=(capacity/4)){
                    capacity =(capacity/2);
                    int newstack[]=new int[capacity];
                    System.arraycopy(stack, 0, newstack,0, top);
                stack=newstack;
            
             }
    }
        
    
}
