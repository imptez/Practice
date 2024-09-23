package design_pattern.com.company.ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel,String msg){
        if(logLevel == DEBUG){
            System.out.println("Debug :"+msg);
        }else{
            super.log(logLevel,msg);
        }
    }
}
