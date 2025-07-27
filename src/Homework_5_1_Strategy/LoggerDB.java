package Homework_5_1_Strategy;

public class LoggerDB implements LoggingData{
    @Override
    public void log(String logString) {
        System.out.println("Запись в БД " + logString);
    }
}
