import org.testng.annotations.*;

public class TC1 {
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
        System.out.println("This will Execute After Every Test Method");
    }

    @Test
    void test1() {
        System.out.println("This is Test 1..");
    }

    @Test
    void test2() {
        System.out.println("This is test 2..");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("This will execute before Test");
    }

    @AfterTest
    void afterTest() {
        System.out.println("This will execute after Test");
    }
}
