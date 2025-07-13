package Homework_3_1;

import java.io.*;

public class WorkingWithFiles implements FileWorker{

    public String GetTextFromFile(String fileName) throws FileWorkerException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            return content.toString();
        } catch (Exception e) {
            throw new FileWorkerException(
                    e,
                    fileName,
                    FileWorkerException.TypeFileOperation.READ
            );
        }
    }

    public void AddTextToFile(String fileName, String textRecorded) throws FileWorkerException {
        try (PrintWriter  writer = new PrintWriter(new FileWriter(fileName,true))) {
            writer.println(textRecorded);
        } catch (Exception e) {
            throw new FileWorkerException(
                    e,
                    fileName,
                    FileWorkerException.TypeFileOperation.WRITE
            );
        }
    }

    public void OverrideFile(String fileName, String textRecorded) throws FileWorkerException {
        try (PrintWriter  writer = new PrintWriter (new FileWriter(fileName))) {
            writer.println(textRecorded);
        } catch (Exception e) {
            throw new FileWorkerException(
                    e,
                    fileName,
                    FileWorkerException.TypeFileOperation.WRITE
            );
        }
    }
}
