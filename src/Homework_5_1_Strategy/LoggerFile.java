package Homework_5_1_Strategy;

public class LoggerFile implements LoggingData{
    @Override
    public void log(String logString) {
        System.out.println("Запись в файл " + logString);
    }
}
