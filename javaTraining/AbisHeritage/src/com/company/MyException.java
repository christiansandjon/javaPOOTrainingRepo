package com.company;

import org.w3c.dom.ls.LSOutput;

public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
