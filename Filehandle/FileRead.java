package Filehandle;

import java.io.*;
import java.util.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            File myobj = new File("myfile.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
        }
    }
}
