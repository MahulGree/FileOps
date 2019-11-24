package fileops;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFilesClassicWay {
 
    public void readAndDisplayFile(String fileName) throws IOException {
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName) , charset)) {
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}