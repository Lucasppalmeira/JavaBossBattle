package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;


public class Player 
{
    public Vector2 position; // position of the player
    public Vector2 velocity; // velocity of the player
    public Sprite sprite;   // sprite of the player

    img = new Texture("player.png"); // image of the player

    public Player(Texture img)
    {
        sprite = new Sprite(img);  // create the sprite
        Vector2 positon = new Vector2(Gdx.graphics.getWidth()/2,0); // set the position to the center of the screen
        sprite.setScale(4, 4);
    }

    public void Draw(SpriteBatch batch)
    {
        sprite.setPosition(position.x, position.y); // set the position of the sprite
        sprite.draw(batch, 0); // draw the sprite
    }




    
}
