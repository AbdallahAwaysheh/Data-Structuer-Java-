package org.abdallah.datastructuer.impl;

import org.abdallah.utils.StackInterface;

public class Stack<T> implements StackInterface<T> {

    private Integer size;
    private T[] items;

    @SuppressWarnings("unchecked")
    public Stack() {
        size = 0;
        items = (T[]) new Object[10];
    }

    @Override
    public void push(T item) {
        if (size == items.length) {
            resize();
        }
        items[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T deletedItem = items[size - 1];
        items[--size] = null;
        return deletedItem;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        System.out.print("[");
        for (T item:items){
            if (item==items[size-1]){
                System.out.print(item);
                break;
            }
            if (item != null) {
                System.out.print(item + ", ");
            }
        }
        System.out.println("]");
        System.out.println("Size = "+size);
        System.out.println("stack.length = "+items.length);
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newItems = (T[]) new Object[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, items.length);
        items = newItems;
    }

    @SuppressWarnings("unchecked")
    public void clearNulls(){
        if (items.length>20){
            T[] newItems = (T[])new Object[size];
            System.arraycopy(items,0,newItems,0,size);
            items = newItems;
        }
    }
}
