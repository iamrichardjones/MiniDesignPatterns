package unittestwithoutexternalfiles;

import org.junit.Test;
import util.FilePathUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnitTestFriendlyFileReaderTest {

    private static final String NEW_LINE = System.getProperty("line.separator");
    private static final String TEST_FILE = "UnitTestFriendlyFileReader/test.txt";

    @Test
    public void test_ReadFile_FromOverloadedBufferedReaderConstructor() throws IOException {
        final String input = "abc" + NEW_LINE + "def" + NEW_LINE + "ghi";
        checkResults(new UnitTestFriendlyFileReader(new BufferedReader(new StringReader(input))).readLines());
    }

    @Test
    public void test_ReadFile_FromOverloadedFileonstructor() throws IOException {
        File ip = new File(FilePathUtils.TEST_RESOURCE, TEST_FILE);
        assertTrue(ip.isFile());
        checkResults(new UnitTestFriendlyFileReader(ip).readLines());
    }

    @Test
    public void test_ReadFile_FromFileThenPassValuesBackInToProveCtorsWorkTheSame() throws IOException {
        StringBuilder sb = new StringBuilder();

        {//read from a file
            File ip = new File(FilePathUtils.TEST_RESOURCE, "UnitTestFriendlyFileReader/test.txt");
            assertTrue(ip.isFile());

            List<String> lines = new UnitTestFriendlyFileReader(ip).readLines();
            checkResults(lines);

            ///now load results into a string
            for (int i = 0; i < lines.size() - 1; i++) {
                sb.append(lines.get(i)).append(NEW_LINE);
            }
            sb.append(lines.get(lines.size() - 1));
        }
        { //now read that String in and check results again
            checkResults(new UnitTestFriendlyFileReader(new BufferedReader(new StringReader(sb.toString()))).readLines());
        }
    }

    private void checkResults(List<String> res) {
        assertEquals(3, res.size());
        assertEquals("abc", res.get(0));
        assertEquals("def", res.get(1));
        assertEquals("ghi", res.get(2));
    }
}
