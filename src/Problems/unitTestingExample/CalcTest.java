package Problems.unitTestingExample;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void multiplication() {

        //In order to call the method in question, multiplication, an instance of the Calc class has to be created
        Calc calculator = new Calc();

        //Initializing the expected value of two times one to two
        int expected = 2;

        //The actual value is initialized to the computation done of 2*1 by the multiplication method in the Calc class
        int actual = calculator.multiplication(1,2);

        /*
        This assertion statement tests whether or not the value I expect is equal to the value that is computed
        This statement allows the developer to leverage the clear and simple reporting mechanisms of the JUnit framework
        */
        assertEquals(expected, actual);


    }
}