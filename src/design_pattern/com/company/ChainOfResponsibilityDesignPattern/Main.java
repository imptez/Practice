package design_pattern.com.company.ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(1,"This is info log");
        logProcessor.log(2,"This is debug log");
        logProcessor.log(3,"This is error log");
        logProcessor.log(2,"This is second debug log");
    }
}
