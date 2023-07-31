import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("Opening Browser");

    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is Login");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("Closing Browser");
    }

}
