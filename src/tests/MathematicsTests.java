package tests;

import classes.Mathematics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathematicsTests {

    // unit test: un test care testeaza o singura unitate a unei aplicatii
    // adica o singura metoda
    // adnotare transforma o metoda normala, intr-o metoda speciala


    private Mathematics m;

    @Before
    public void setup(){
        m = new Mathematics();
        System.out.println("Object initialized");
    }
    @Test
    public void addTwoNumbersTest() {
        // AAA -
        // ARRANGE- partea in care pregatim metoda pentru a fi apelata (sa-i facem un obiect)
      //  Mathematics m = new Mathematics();

        // ACT - partea in care se actioneaza , adica sa apelam metoda
        int actualResult = m.addTwoNumbers(1, 2);

        // ASSERT - se adevereste(assertion) )ca resultatul (actual) este cel dorit (expected)
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calculateAverageTest(){

       // Mathematics m = new Mathematics();
        int actualResult = m.calculateAverage(1,2,3);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void findMaxWhenSecondArgumentIsGreaterTest(){
        int actualResult = m.findMax(1,2);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void findMaxWhenFirstArgumentIsGreaterTest(){
        int actualResult = m.findMax(2,1);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
