/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DS_week4;

/**
 *
 * @author ivy
 */
public class DLNode<T> {
    
    T el;
    DLNode<T> pre;
    DLNode<T> suc;
    
    public DLNode(T el, DLNode<T> pre,DLNode<T> suc){
        this.el=el;
        this.pre=pre;
        this.suc=suc;
    }
    public DLNode(T el){
        this(el,null,null);
    }
    public String toString(){
        String preString=(pre==null ? "null" : pre.el.toString());
        String sucString=(suc==null ? "null" : suc.el.toString());

        return "Node : "+el+" , pre : "+preString+" , suc : "+sucString;
    }

}
