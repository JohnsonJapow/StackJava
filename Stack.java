/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DS_week4;

/**
 *
 * @author ivy
 */
    public interface Stack<T>{
        public void push(T el);
        public  T pop();
        public T peek();
        public int realocate();
    }
