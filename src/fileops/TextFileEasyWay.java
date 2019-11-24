
package fileops;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFileEasyWay {

    public void readAndDisplayFile(String fileName) throws IOException {
        List<String> fileLines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        for(String line : fileLines) {
            System.out.println(line);
        }
    }
}
