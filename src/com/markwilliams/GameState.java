package com.markwilliams;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Game game){
        super(game);
        player = new Player(game,100,100);
        world = new World("");

    }

    @Override
    public void tick() {
        world.tick();
        player.tick();

    }

    @Override
    public void render(Graphics g) {
    world.render(g);
    player.render(g);
//    Tile.tiles[0].render(g, 0, 0);
    }
}