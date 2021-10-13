/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4;

import java.util.Arrays;

/**
 *
 * @author Burak Kacmaz
 */
public class Stack <Customer> {
    
    private int size = 0;//Stack size'i icin
    private static final int DEFAULT_CAPACITY = 20;//Soruda 5 elemanli fakat baska denemeler icin 20ye kadar izin verildi
    private Object elements[];

    public Stack() {//constructor
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Customer e) {//push methodu
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public Customer pop() {//pop methodu
        Customer e = (Customer) elements[--size];
        elements[size] = null;
        return e;
    }
    
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    
    public boolean isEmpty() {//isEmpty methodu
        if (size == 0) {
            System.out.println("Stack is empty.");
            return true;
        }
        return false;
    }  
}
