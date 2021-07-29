import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;



@RunWith(Parameterized.class)
public class MyMathTest   {
    int a,b,expRessult;

    @Rule
    public TestRule timeout= new Timeout(1);

    @Parameterized.Parameters
    public static List<Object[]> numbers(){
        return  Arrays.asList(new Object[][]{{1,2,3},{2,9,11},{3,3,6}});
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 100)
    public void testAdd() {
        System.out.println("add");
//        int a = 1;
//        int b = 2;
//        int expRessult = 3;
        int ressult = MyMath.add(a,b);
        assertEquals(expRessult,ressult);
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDiv() {
        System.out.println("div");
        int a = 4;
        int b = 0;
        int expRessult = 2;
        int ressult = MyMath.div(a,b);
        assertEquals(expRessult,ressult);

    }

    public MyMathTest(int a, int b, int expRessult) {
        this.a = a;
        this.b = b;
        this.expRessult = expRessult;
    }
}