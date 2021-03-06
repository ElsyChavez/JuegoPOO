package dev.game.state;

/**
 * @author EFGK
 */
import dev.game.Entity.Creature.Player;
import dev.game.Handler;
import dev.game.gfx.Assets;
import dev.game.worlds.World;
import java.awt.Graphics;


public class GameState1_5 extends State {

    private final World World1;

    public World getWorld1() {
        return World1;
    }

    public GameState1_5(Handler handler) {
        super(handler);
        World1 = new World(handler, "src/Worlds/World1_1.txt");
        handler.setWorld(World1);
        
    }

    @Override
    public void tick() {
        World1.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F2, 0, 0, 3968, 500, null);
        World1.render(g);
        
    }

}
