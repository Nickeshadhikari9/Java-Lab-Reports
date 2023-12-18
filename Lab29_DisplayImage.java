import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Lab29_DisplayImage extends Applet {
    private Image image;

    public void init() {
        image = getImage(getCodeBase(), "nick.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
