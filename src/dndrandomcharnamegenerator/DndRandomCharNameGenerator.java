package dndrandomcharnamegenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DndRandomCharNameGenerator {

    public static void main(String[] args) throws FileNotFoundException {
        File nameFile = new File("characterList.txt");
        
        ArrayList<String> names = new ArrayList<>();
        Scanner reader = new Scanner(nameFile);
        System.out.println("Reading File:");
        if (nameFile.canRead()) {
            System.out.println("Read file success!");
            System.out.println("Preparing names:");
            while(reader.hasNextLine()) {
                names.add(reader.nextLine());
            }
            System.out.println("Names are ready!");
            int rand = (int) ((Math.random() * ((names.size() - 0) + 1)) + 0);
            System.out.println("This is the random name foud: " + names.get(rand));
        } else {
            System.out.println("Read file failed!");
        }            
    }   
}
