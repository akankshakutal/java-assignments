package com.step.assignment;

import java.util.List;

public class ListIterator {

    private List list;
    private int index =-1;

    public ListIterator(List list) {
        this.list = list;
    }

    public boolean hasNext(){
        return index+1 < list.size();
    }

    public Object next(){
        Object object = null;
        try {
            index++;
            object = list.get(index);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return object;
    }

    public void add(Integer element){
        list.add(element);
    }
}
