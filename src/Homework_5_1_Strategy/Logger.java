package Homework_5_1_Strategy;

public class Logger {
    private LoggingData loggingData ;
    public void setLoggingData(LoggingData loggingData) {
        this.loggingData=loggingData;
    }

    public void LogData(String logeData) {
        loggingData.log(logeData);
    }
}
