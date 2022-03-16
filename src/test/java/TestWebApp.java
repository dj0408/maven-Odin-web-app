
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TestWebApp
{
  
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new WebApp();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        WebApp.main(null);
        try {
            assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello World!\"");
        }
    } 
    @Test
    public void testcarprice()
    { WebApp a1 = new WebApp();
     try {
       assertEquals("honda is expensive", a1.carprice("honda")," it should come expensive");}
     catch (AssertionError e)
     {System.out.println("Different test case");}
     
        }
  @Test
  public void testadd()
  {  WebApp a2 = new WebApp();
   try { assertEquals(3, a2.add1(1,2));}
   catch (AssertionError e)
   {System.out.println(" Test is failed");}
  }
   @Test
  public void testadd1()
  {  WebApp a5 = new WebApp();
   try { assertEquals(6, a5.add1(2,4));}
   catch (AssertionError e)
   {System.out.println(" Test is failed");}
  }
   @Test
  public void testmulti1()
  {  WebApp a3 = new WebApp();
     try {assertEquals(6,a3.mult1(2,3));}
   catch (AssertionError e)
   {System.out.println("test failed");}
   }
   @Test
  public void testdiv1()
  {  WebApp a4 = new WebApp();
     try {assertEquals(2,a4.div1(8,4));}
   catch (AssertionError e)
   {System.out.println("test failed");}
   }
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}