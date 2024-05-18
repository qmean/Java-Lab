package org.example;

import org.example.sampleException.TestException;
import org.example.sampleException.TestRuntimeException;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            ThrowCheckError();
        } catch (TestException e) {
            throw new RuntimeException(e);
        }
        ThrowUncheckError();
    }

    public static void ThrowCheckError() throws TestException {
        throw new TestException("체크 에러입니다.");
    }

    public static void ThrowUncheckError() {
        throw new TestRuntimeException("언체크 에러입니다.");
    }
}