package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.core.screens.BaseScreen;
import com.mygdx.game.entities.CustomButton;
import com.mygdx.game.entities.CustomImage;
import com.mygdx.game.helpers.AssetsManager;

public class GameOverScreen extends BaseScreen {
    private TextButton btnBack;
    private Image imgGameOver;
    @Override
    protected void init() {
        requiredProcessor = true;
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.font = new BitmapFont();
        style.fontColor = Color.GOLD;
        style.overFontColor = Color.GREEN;
        style.downFontColor = Color.RED;
        btnBack = new CustomButton("Menu",style,new Vector2(40,140),new Vector2(200,80),new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                MyGdxGame.instance.setScreen(new GameScreen());
            }
        });
        imgGameOver = new CustomImage(AssetsManager.getAssetManager().get("logo.png", Texture.class),new Vector2());
        imgGameOver.setPosition(Gdx.graphics.getWidth()/2-imgGameOver.getWidth()/2,Gdx.graphics.getHeight()/2-imgGameOver.getHeight()/2);
        addActor(imgGameOver);
        addActor(btnBack);

    }

    @Override
    protected void draw(float delta) {

    }
}
