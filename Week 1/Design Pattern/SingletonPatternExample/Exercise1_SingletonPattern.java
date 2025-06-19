package SupersetGogulan.week1.DesignPattern;
// Logger Class
public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger initialized only once.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); 
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[Log] " + message);
    }
}

//Main class
package SupersetGogulan.week1.DesignPattern;

public class Main {
    public static void main(String[] args){
        System.out.println("\n------- Logger Application: Singleton Pattern -------\n");
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));

        logger1.log("First log message \n"); 
        logger2.log("second log message \n");
    }
}



