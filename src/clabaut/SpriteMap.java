package clabaut;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteMap {
    private final BufferedImage image;
    private final int offsetX;
    private final int offsetY;
    private final int spriteWidth;
    private final int spriteHeight;

    public SpriteMap(String resource, int offsetX, int offsetY, int spriteWidth, int spriteHeight) {
        this.image = readImage(resource);
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.spriteWidth = spriteWidth;
        this.spriteHeight = spriteHeight;
    }

    private BufferedImage readImage(String resource) {
        try {
            return ImageIO.read(Sprite.class.getClassLoader().getResource(resource));
        } catch (IOException e) {
            throw new OefeningException(e);
        }
    }

    public void draw(Graphics g, int spriteX, int spriteY, int x, int y) {
        g.drawImage(image,
                x, y, x+spriteWidth, y+spriteHeight,
                offsetX + (spriteX*spriteWidth), offsetY + (spriteY*spriteHeight),
                offsetX + ((spriteX+1)*spriteWidth), offsetY + ((spriteY+1)*spriteHeight),
                null);
    }
}

