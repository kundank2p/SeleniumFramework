import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass() {
        System.out.println("This will execute before every class");
    }

    @AfterClass
    void AfterClass() {
        System.out.println("This will execute after every class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will Execute After every Method");
    }

    @Test
    void test4() {
        System.out.println("This is Test 4");
    }

    @Test
    void test3() {
        System.out.println("This is Test 3");
    }

    @BeforeSuite
    void beforeSuit() {
        System.out.println("This will execute before Test Suit");
    }

    @AfterSuite
    void afterSuit() {
        System.out.println("This will execute after Test Suit");
    }
}
