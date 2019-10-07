/**
 * Written by:	Chinmay Bhale
 * 				cvbhale@asu.edu
 * 				1216362121
 * 
 * AddingMachineTest.java:	This class tests the AddingMachine by doing 
 *                          a series of JUnit tests. 
 * 
 * 	Subject:			CSE360, Friday, 10:40 am
 * 
 * @author Chinmay Bhale 
 */
package cse360assign2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for AddingMachine.
 */
public class AddingMachineTest 
{
    /**
     * Does a simple single addition and checks the value
     * of total and history
     */
    @Test
    public void add() {
        
        AddingMachine myCalculator = new AddingMachine();

        myCalculator.add(4);

        assertEquals(4, myCalculator.getTotal());
        assertEquals("0 + 4", myCalculator.toString());
    }

    /**
     * Does a simple single subtraction and checks the value 
     * of total and history
     */
    @Test
    public void subtract() {

        AddingMachine myCalculator = new AddingMachine();

        myCalculator.subtract(2);

        assertEquals(-2, myCalculator.getTotal());   
        assertEquals("0 - 2", myCalculator.toString());

    }

    /**
     * Does many operations and checks the values of 
     * total and history
     * 
     * List of operations performed taken from assignment doc
     */
    @Test
    public void multipleOps() {

        AddingMachine myCalculator = new AddingMachine();

        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);

        assertEquals(7, myCalculator.getTotal());
        assertEquals("0 + 4 - 2 + 5", myCalculator.toString());
    }

    /**
     * Checks the value of total and history when no operation is
     * performed
     */
    @Test
    public void noOp() {

        AddingMachine myCalculator = new AddingMachine();

        assertEquals(0, myCalculator.getTotal());
        assertEquals("0", myCalculator.toString());
    }

    /**
     * Checks the value of total and history after they have 
     * been cleared using the clear() method.
     */
    @Test
    public void testClear() {

        AddingMachine myCalculator = new AddingMachine();

        myCalculator.add(1);
        myCalculator.subtract(2);
        myCalculator.add(4);

        myCalculator.clear();

        myCalculator.subtract(4);
        myCalculator.add(2);
        myCalculator.subtract(5);

        assertEquals((-4 + 2 - 5), myCalculator.getTotal());
        assertEquals("0 - 4 + 2 - 5", myCalculator.toString());
    }
}
