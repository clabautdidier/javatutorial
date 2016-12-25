package stappen.stap4;

import clabaut.SpriteMap;
import clabaut.Paneel;
import clabaut.Sprite;

import java.awt.*;

public class Stap4Paneel extends Paneel {
    private final Sprite muur;
    private final SpriteMap player;

    public Stap4Paneel() {
        muur = new Sprite("muur.png");
        player = new SpriteMap("player-spritemap-v9.png", 0, 0, 46, 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        muur.draw(g, 50, 50);

        for (int x=0; x<8; x++)
            for (int y=0; y<4; y++)
                player.draw(g, x, y, x*50, 50+(y*50));
    }
}
