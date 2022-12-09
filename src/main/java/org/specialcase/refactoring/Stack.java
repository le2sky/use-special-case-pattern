package org.specialcase.refactoring;

public interface Stack {
    Boolean isEmpty();

    Integer getSize();

    void push(int element);

    int pop();
}
