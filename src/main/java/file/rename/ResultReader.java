package file.rename;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResultReader {

    public static void print(final java.io.InputStream inputStream) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line + "abc");
        }
    }
}
