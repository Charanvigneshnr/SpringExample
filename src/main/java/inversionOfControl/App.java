package inversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("databaseIOC.xml");
        CloudDB cloudDB = (CloudDB) context.getBean("cloudDB");
        LocalDB localDB = (LocalDB) context.getBean("localDB");
        WebDB webDB = (WebDB) context.getBean("webDB");
        cloudDB.getMessage();
        localDB.getMessage();
        webDB.getMessage();
    }
}
