package app;

import picture_file.Image;
import read_file.ReadFile;
import write_file.WriteFile;

public class MainApp {
    public static void main(String[] args) {

        WriteFile.writeNewData();
        ReadFile.readWithBuff();
        Image.imageIoWrite();


    }
}
