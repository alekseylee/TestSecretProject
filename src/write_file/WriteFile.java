package write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void writeNewData() {
        Path path = Path.of("Secret_Folder/Secret_Message.txt");

        try {
            Files.createDirectories(path.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new
                FileWriter("Secret_Folder/Secret_Message.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("The wolf is in the pig pen. I repeat: the wolf is in the pig pen.");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
