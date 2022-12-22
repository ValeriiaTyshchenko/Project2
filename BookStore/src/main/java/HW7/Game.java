package HW7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType{
        SOCCER,
        HOCKEY,
        RUGBY

    }

    public static void writeToNumOfPlayersPerTeam(GameType game){
        String fileName = "";


        switch (game){
            case SOCCER:
                createNewFile("soccer.txt");
                writeToFile("soccer.txt","11");

                break;
            case HOCKEY:
                createNewFile("hockey.txt");
                writeToFile("hockey.txt", "6");

                break;
            case RUGBY:
                createNewFile("rugby.txt");
                writeToFile("rugby.txt", "15");

        }

    }
    private static void createNewFile(String fileName){
        File file = new File(fileName);
        try{
            file.createNewFile();
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }


    }
    private static void writeToFile(String fileName, String txt){

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }

    }
}
