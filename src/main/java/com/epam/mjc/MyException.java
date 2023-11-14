package com.epam.mjc;

public class MyException extends IllegalArgumentException {
    long id;
    public MyException(long id) {
        this.id = id;
    }
    public String toString() {
        return "Could not find student with ID " + id;
    }
}
