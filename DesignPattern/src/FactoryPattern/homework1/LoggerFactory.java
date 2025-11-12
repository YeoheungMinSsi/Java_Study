package FactoryPattern.homework1;

public class LoggerFactory {
    public Logger getLogger(String message){
        Logger logger = null;

        if(message.equals("file")){
            logger = new FileLogger();
        } else if(message.equals("console")){
            logger = new ConsoleLogger();
        } else if(message.equals("cloud")){
            logger = new CloudLogger();
        }
        return logger;
    }
}
