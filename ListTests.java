import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests implements StringChecker{
    public boolean checkString(String s) {
        if (s.length() < 4) {
            return true;
        }
        else {
            return false;
        }
    }

    @Test
    public void testFilter1() {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("one");
        strs.add("two");
        strs.add("three");
        strs.add("four");


        ArrayList<String> strsExpected = new ArrayList<>();
        strsExpected.add("one");
        strsExpected.add("two");

        StringChecker sc = new ListTests();
        assertEquals(strsExpected, ListExamples.filter(strs, sc));
    }

    @Test
    public void testMerge1() {
        ArrayList<String> strs1 = new ArrayList<>();
        strs1.add("a");
        strs1.add("g");
        strs1.add("q");
        ArrayList<String> strs2 = new ArrayList<>();
        strs2.add("c");
        strs2.add("z");
        ArrayList<String> strsExpected = new ArrayList<>();
        strsExpected.add("a");
        strsExpected.add("c");
        strsExpected.add("g");
        strsExpected.add("q");
        strsExpected.add("z");

        assertEquals(strsExpected, ListExamples.merge(strs1, strs2));
    }
}
