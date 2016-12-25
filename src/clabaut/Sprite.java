package clabaut;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Sprite {
    private final BufferedImage image;

    public Sprite (String resource) {
        this.image = readImage(resource);
    }

    private BufferedImage readImage(String resource) {
        try {
            return ImageIO.read(Sprite.class.getClassLoader().getResource(resource));
        } catch (IOException e) {
            throw new OefeningException(e);
        }
    }

    public void draw (Graphics g, int x, int y) {
        g.drawImage(image, x, y, null);
    }

    public void draw (Graphics g, int x, int y, int width, int height) {
        g.drawImage(image, x, y, width, height, null);
    }
}
