package dhbw.karlsruhe.tinf13b3.HelloWorld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void test(){
    	System.out.println("funktioniert");
    }
    
    public void testRechnung(){
    	Rechner rechner = new Rechner();
    	
    	assertTrue(rechner.rechnung(5, 7) == 13);
    	
    }
}
