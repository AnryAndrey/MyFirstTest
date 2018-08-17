package com.lysenko.datastructures.list;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayListTest {
    private ArrayList arrayWithThreeElements = new ArrayList();

    @Before
    public void before() {
        arrayWithThreeElements.add("A");
        arrayWithThreeElements.add("B");
        arrayWithThreeElements.add("C");
    }

    @Test
    public void testGetByIndex() {
        assertEquals(3, arrayWithThreeElements.size());

        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("B", arrayWithThreeElements.get(1));
        assertEquals("C", arrayWithThreeElements.get(2));
    }

    @Test
    public void testSize() {
        assertEquals(3, arrayWithThreeElements.size());
    }

    @Test
    public  void testInsert() {
        arrayWithThreeElements.add("G", 2);
        assertEquals("G", arrayWithThreeElements.get(2));
        assertEquals("B", arrayWithThreeElements.get(1));
        assertEquals("A", arrayWithThreeElements.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertExceptionMinus(){
        arrayWithThreeElements.add("R", -5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertExceptionPlus(){
        arrayWithThreeElements.add("R", 20);
    }

    @Test
    public void testDeletion(){
        arrayWithThreeElements.remove(1);
        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("C", arrayWithThreeElements.get(1));
    }

}