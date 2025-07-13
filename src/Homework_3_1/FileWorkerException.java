package Homework_3_1;

public class FileWorkerException extends Exception{
    public String filePath;
    public TypeFileOperation typeFileOperation;
    public enum TypeFileOperation{
        READ,
        WRITE,
    }
    public FileWorkerException(Exception exception, String filePath, TypeFileOperation typeFileOperation) {
        super(exception);
        this.filePath = filePath;
        this.typeFileOperation = typeFileOperation;
        System.out.println(toString());
    }
    public FileWorkerException(String message, String filePath, TypeFileOperation typeFileOperation) {
        super(message);
        this.filePath = filePath;
        this.typeFileOperation = typeFileOperation;
        System.out.println(toString());
    }
    public String getFilePath() {
        return filePath;
    }
    public TypeFileOperation getTypeFileOperation() {
        return typeFileOperation;
    }
    @Override
    public String toString(){
        String result;
        result="Произошёл сбой:";
        result+=System.lineSeparator()+"Операция: " + getTypeFileOperation();
        result+=System.lineSeparator()+"Файл: " + getFilePath();
        result+=System.lineSeparator()+"Сообщение: " + getMessage();
        return  result;
    }
}
