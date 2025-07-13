package Homework_3_1;

public interface FileWorker {
    String GetTextFromFile(String fileName) throws FileWorkerException ;
    void AddTextToFile(String fileName, String textRecorded) throws FileWorkerException ;
    void OverrideFile(String fileName, String textRecorded) throws FileWorkerException ;
}
