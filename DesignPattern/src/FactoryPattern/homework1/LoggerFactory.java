package FactoryPattern.homework1;

public class LoggerFactory {
    public Logger getLogger(String message){
        Logger logger = null;

        if(message.equals("file")){
            logger = new FileLogger();
        } else if(message.equals("env")){  // 운영(console)
            logger = new ConsoleLogger();
        } else if(message.equals("cloud")) {
            logger = new CloudLogger();
        } else if(message.equals("test")){
            logger = new TestLogger();
        }
        return logger;
    }
}
