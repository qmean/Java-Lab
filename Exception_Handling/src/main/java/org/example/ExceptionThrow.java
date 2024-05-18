package org.example;

import org.example.sampleException.TestException;

public class ExceptionThrow {
    public static void ThrowExceptionString() throws TestException {
        throw new TestException("test exception");
    }

    public static void ThrowExceptionCause() throws TestException {
        throw new TestException();
    }
}
