import hello.HelloWorld;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
  @Test
  public void verifyOutput() {

      ByteArrayOutputStream os = new ByteArrayOutputStream();
      System.setOut(new PrintStream(os));

      HelloWorld.main(new String[]{});
      String expectedOutput = "Hello world!\n";

      assertEquals(expectedOutput, os.toString());
  }
}
