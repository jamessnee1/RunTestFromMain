import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void SampleTest(){
        String message = "Hello, world!";
        System.out.println(message);
        Assert.assertEquals(message, "Hello, world!");
    }
}
