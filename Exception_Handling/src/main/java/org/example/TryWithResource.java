package org.example;

import java.io.Closeable;

public class TryWithResource {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        } catch (CloseException e) {
            e.printStackTrace();
        } catch (WorkException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------");

        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);
        } catch (CloseException e) {
            e.printStackTrace();
        } catch (WorkException e) {
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork("+exception+")가 호출됨");

        if (exception) {
            throw new WorkException("WorkException 발생");
        }
    }

    public void close() throws CloseException {
        System.out.println("close가 호출됨");
        throw new CloseException("CloseException 발생");
    }
}

class WorkException extends Exception {
    public WorkException(String message) {
        super(message);
    }
}

class CloseException extends Exception {
    public CloseException(String message) {
        super(message);
    }
}