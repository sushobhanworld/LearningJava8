package project;

public class InvalidWholeSaleException extends Exception {
    String message;

    public InvalidWholeSaleException(String message) {
        this.message=message;
    }
}
