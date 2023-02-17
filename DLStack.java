/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DS_week4;
import java.util.Arrays;
/**
 *
 * @author ivy
 */
public class DLStack<T> implements Stack<T> {
    //private int maxSize;
    //private int top;
    //private T [] items;
    private DLNode<T> first;
    private DLNode<T> last;
    
    public DLStack(int size){
        //this.maxSize=size;
        //this.top=-1;
        //this.items=(T[])new Object [maxSize];
        this.first=null;
        this.last=null;
    }
    
    public void push(T el){
        if(isEmpty()){
            last=new DLNode<>(el,null,null);
            first=last;
        }
        else{
            DLNode<T> temp=last;
            last=new DLNode(el,temp,null);
            
        }
        /*if(top==maxSize){
            throw new IndexOutOfBoundsException();
        }
        else if(isEmpty()){
            first=new DLNode(el,null,null);
            last=first;
            top++;        
            items[top]=el;
        }
        else{
            last.suc=new DLNode(el,last,null);
            last=last.suc;
            top++;
            items[top]=el;
            
        }
        */
    }
    /*
    public int realocate(){
        maxSize*=2;
        items=Arrays.copyOf(items,maxSize);
        return maxSize;
    }
    */
    public T pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        else{
            T value=last.el;
            DLNode<T> temp=last.pre;
            last=temp;
            
            return value;
        }
        /*
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        else if(top==0){
            T element=items[top];
            element= first.el;
            first=new DLNode(null,null,null);
            last=first;
            top--;
            
            return element;
        }
        else{
           T element=items[top];
            element=last.el;
           last.pre=new DLNode(last.pre.el,last.pre.pre,null);
           last=last.pre;
           top--;
           return element;
        }
      */
    }
    private boolean isEmpty(){
        return last==null;
    }
    
    @Override
    public T peek(){
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            T value = last.el;
            return value;
        }          
    }
    @Override
    public String toString(){
        String str="TOP";
        DLNode<T> top=last;
        while(top!=null){
            
            str+="\n"+top.el;
            top=top.pre;
            
        }
        return str+"\nBOTTOM";
    }

    public static void main(String args[]) {
        Stack<Integer> s = new DLStack<>(1000);
        s.push(1);
        System.out.println("The top item of the stack is "+s.peek());
        s.push(2);
        System.out.println("The top item of the stack is "+s.peek());
        s.push(3);
        System.out.println("The top item of the stack is "+s.peek());
        s.push(4);
        System.out.println("The top item of the stack is "+s.peek());
        
        for (int i = 0; i < 500; i++) {
            s.push(i);
        }
        
        System.out.println("stack : \n" + s.toString());
        //System.out.println("The max size of the stack is : "+s.realocate());
        System.out.println("The item be rid of is "+s.pop());
        System.out.println("The item be rid of is "+s.pop());
        System.out.println("The item be rid of is "+s.pop());
        System.out.println("The item be rid of is "+s.pop());

 
        System.out.println("stack : \n" + s.toString());
        //System.out.println("The item be rid of is "+s.pop());
    }
}
