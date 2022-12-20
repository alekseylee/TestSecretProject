package picture_file;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Image {

    public static void imageIoWrite() {
        BufferedImage bImage = null;
        try {
            URL url = new URL("https://worldstories.org.uk/content/book/262/__picture_9352.jpg");
            bImage = ImageIO.read(url);

            ImageIO.write(bImage, "jpg", new File("Secret_Folder/Secret_Picture.jpg"));

        } catch (IOException e) {
            System.out.println("Exception occurred :" + e.getMessage());
        }
        System.out.println("Images were written successfully.");

        JFrame frame = new JFrame();
        frame.setSize(1080, 960);
        JLabel label = new JLabel(new ImageIcon(bImage));
        frame.add(label);
        frame.setVisible(true);
    }

}
