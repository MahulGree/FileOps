package fileops;

import java.io.IOException;

// https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles

public class FileOps {

    private static String fileName = "C:\\Users\\fury161\\Documents\\NetBeansProjects\\FileOps\\data\\TestConfig.txt";
    
    public static void main(String[] args) {

        // ---------------------------------------------------------------------
        // Text files
        // ---------------------------------------------------------------------       
        
        // The classic way
        TextFilesClassicWay classicWay = new TextFilesClassicWay();
        try {
            System.out.format("\nReading text file - the classic way\n");
            System.out.format("-----------------------------------\n");
            classicWay.readAndDisplayFile(fileName);
        } catch (IOException ex)  {
            System.err.format("IOException: %s%n", ex);
        }
        
        // The easy way
        TextFileEasyWay easyWay = new TextFileEasyWay();
        try {
            System.out.format("\nReading text file - the easy way\n");
            System.out.format("-----------------------------------\n");
            easyWay.readAndDisplayFile(fileName);
        } catch (IOException ex)  {
            System.err.format("IOException: %s%n", ex);
        }
        
        // Using text file ops for confuguration parsing
        ConfigurationParser configurationParser = new ConfigurationParser();
        try {
            System.out.format("\nParsing the configuration\n");
            System.out.format("-----------------------------------\n");
            configurationParser.parseAndDisplay(fileName);
        } catch (IOException ex)  {
            System.err.format("IOException: %s%n", ex);
        }
    }
}   