package unittestwithoutexternalfiles;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

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