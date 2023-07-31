import org.testng.annotations.Test;

public class GroupsExample {
    @Test(groups = {"sanity"})
    void test1() {
        System.out.println("This is test 1 from Groups Example");
    }

    @Test(groups = {"regression"})
    void test2() {
        System.out.println("This is test 2 from Groups Example");
    }

    @Test(groups = {"sanity"})
    void test3() {
        System.out.println("This is test 3 from Groups Example");
    }

    @Test(groups = {"sanity"})
    void test4() {
        System.out.println("This is test 4 from Groups Example");
    }

    @Test(groups = {"regression","sanity"})
    void test5() {
        System.out.println("This is test 5 from Groups Example");
    }

}
