package dhbw.karlsruhe.tinf13b3.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Rechner rechner = new Rechner();
    	
    	System.out.println("2 + 7 = " + rechner.rechnung(2, 7));
    }
}
