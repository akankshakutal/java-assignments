package com.step.assignment.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class Sets<T> {


    public Set<T> getUnion(Set<T> set1, Set<T> set2){
        Set<T> union = new HashSet<>(set1);
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }

    public Set<T> getIntersection(Set<T> set1,Set<T> set2){
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public Set<T> getDifference(Set<T> set1,Set<T> set2){
        Set<T> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }
}
