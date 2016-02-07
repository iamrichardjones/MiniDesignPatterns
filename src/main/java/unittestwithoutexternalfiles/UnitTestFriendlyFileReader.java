package unittestwithoutexternalfiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This mini-design-pattern users an overloaded constructor to enable the coder to pass in
 * contents from a BufferedReader rather than a file. This means that the coder does not need
 * to manager test file resources. They can simply test the class and methods (in this case
 * readLines()) uses resources inside the java class
 *
 * For a clearer example see UnitTestFriendlyFileReaderTest.java
 */
public class UnitTestFriendlyFileReader {

    private final BufferedReader reader;

    public UnitTestFriendlyFileReader(File fileToRead) throws FileNotFoundException {
        this(new BufferedReader(new FileReader(fileToRead)));
    }

    public UnitTestFriendlyFileReader(BufferedReader reader) {
        this.reader = reader;
    }

    public List<String> readLines() throws IOException {
        List<String> res = new ArrayList<String>();
        String line = "";
        while ((line = reader.readLine()) != null) {
            res.add(line);
        }

        return res;
    }
}