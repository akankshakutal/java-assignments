package com.step.assignment.range;



public class AlphabatRange extends Range<Character> {

    public AlphabatRange(Character start, Character end) {
        super(start, end);
        this.createList();
    }

    @Override
    void createList() {
        for (Character i = this.start; i <= this.end; i++) {
            this.list.add(i);
        }
    }
}