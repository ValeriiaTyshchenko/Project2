package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {
        String file = "Legion.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "A quick search reveals that Canada and the United States are neighboring countries that share a lot more " +
                "than the beautiful Niagara Falls. Naming our little ones is one thing we do as parents that affects our children for the rest of their lives. " +
                "You may have religious reasons for a name. Or maybe you follow a family tradition. In recent years, we’ve seen pop culture play a role in parents searching " +
                "for just the right name for their bundle of joy.");
        fileManager.readFromFile(file);
        fileManager.deleteFile(file);



    }

    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeToFile(String fileName, String text){

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Error, cannot write...");
            throw new RuntimeException(e);
        }

    }
    public void readFromFile(String fileMame){
        File file = new File(fileMame);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public void deleteFile(String fileName){
        File file = new File(fileName);
        if(file.exists()){
        file.delete();}
    }
}
