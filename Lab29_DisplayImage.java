import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Lab29_DisplayImage extends Applet {
    private Image image;

    public void init() {
        // Load the image
        image = getImage(getCodeBase(), "myimage.jpg");
    }

    public void paint(Graphics g) {
        // Display the image
        g.drawImage(image, 0, 0, this);
    }
}
