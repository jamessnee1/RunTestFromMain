import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestMain {

    public static void main(String[] args){
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { BaseTest.class });
        testng.addListener(tla);
        testng.run();

    }
}
