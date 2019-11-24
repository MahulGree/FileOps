package fileops;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConfigurationParser {
    public void parseAndDisplay(String fileName) throws IOException {
        List<String> fileLines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        for(String line : fileLines) {
            String[] tokens = line.split(":");
            if (tokens.length != 2) continue;
            switch(tokens[0]) {
                case "school":
                    parseAndDisplaySchool(tokens[1]);
                    break;
                case "subject":
                    parseAndDisplaySubject(tokens[1]);
                    break;
                case "student":
                    parseAndDisplayStudent(tokens[1]);
                    break;
                case "Teacher":
                    parseAndDisplayTeacher(tokens[1]);
                    break;
                case "Demonstrator":
                    parseAndDisplayDemonstrator(tokens[1]);
                    break;
                case "OOTrainer":
                    parseAndDisplayOOTrainer(tokens[1]);
                    break;
                case "GUITrainer":
                    parseAndDisplayGUITrainer(tokens[1]);
                    break;
            }
        }
    }
    
    private void parseAndDisplaySchool(String parameters) {
        System.out.println(String.format("School%n   Name %s", parameters));
    }

    private void parseAndDisplaySubject(String parameters) {
        String[] tokens = parameters.split(",");
        if (tokens.length != 4) return;
        System.out.println(String.format("Subject%n   Dascription %s, Id: %s, Specialism: %s, Duration: %s", tokens[0], tokens[1], tokens[2], tokens[3]));
    }

    private void parseAndDisplayStudent(String parameters) {
        String[] tokens = parameters.split(",");
        if (tokens.length != 3) return;
        System.out.println(String.format("Student%n   Name %s, Gender: %s, Age: %s", tokens[0], tokens[1], tokens[2]));
    }

    private void parseAndDisplayTeacher(String parameters) {
        String[] tokens = parameters.split(",");
        if (tokens.length != 3) return;
        System.out.println(String.format("Teacher%n   Name %s, Gender: %s, Age: %s", tokens[0], tokens[1], tokens[2]));
    }

    private void parseAndDisplayDemonstrator(String parameters) {
        String[] tokens = parameters.split(",");
        if (tokens.length != 3) return;
        System.out.println(String.format("Demonstrartor%n   Name %s, Gender: %s, Age: %s", tokens[0], tokens[1], tokens[2]));
    }

    private void parseAndDisplayOOTrainer(String parameters) {
        String[] tokens = parameters.split(",");
        if (tokens.length != 3) return;
        System.out.println(String.format("OO Trainer%n   Name %s, Gender: %s, Age: %s", tokens[0], tokens[1], tokens[2]));
    }

    private void parseAndDisplayGUITrainer(String parameters) {
        String[] tokens = parameters.split(",");
        if (tokens.length != 3) return;
        System.out.println(String.format("GUI Trainer%n   Name %s, Gender: %s, Age: %s", tokens[0], tokens[1], tokens[2]));
    }
}
