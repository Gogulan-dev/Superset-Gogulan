package SupersetGogulan.week1.DesignPattern;

public class Main {
    public static void main(String[] args){
        System.out.println("\n------- Logger Application: Singleton Pattern -------\n");
        Logger logger1 = Logger.getInstance();
        logger1.log("First message \n"); 

        Logger logger2 = Logger.getInstance();
        logger2.log("second message \n");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance. \n");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }
}
