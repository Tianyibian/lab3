import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ListTests {
    @Test
    public void testFilter(){
    StringChecker filter5=new checking();
    String[] input1 = {"BJ","SH" };
    List<String> places = Arrays.asList("BJ","SH","Córdoba", "La Plata");
    assertArrayEquals(null, input1, ListExamples.filter(places, filter5).toArray());
    }
}

