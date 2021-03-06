package com.lysenko.datastructures.list;


public class ArrayList implements List {
    private Object[] array = new Object[5];
    private int size;

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index)  {
        if (index < 0 || index > size) {
            IndexOutOfBoundsException IndexOutOfBoundsException =
                    new IndexOutOfBoundsException("DFG");
            throw IndexOutOfBoundsException;
        }
        array[index] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        Object result = new Object();

        if (index < 0 || index > size) {
            IndexOutOfBoundsException IndexOutOfBoundsException =
                    new IndexOutOfBoundsException("DFG");
            throw IndexOutOfBoundsException;
        }
        result = array[index];

        for (int i = index; i < array.length-1 ; i++) {
            array[i] = array[i+1];
        }
        array[size] = null;
        size--;

        return result;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}