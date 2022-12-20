package read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void readWithBuff() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("Secret_Folder/Secret_Message.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
