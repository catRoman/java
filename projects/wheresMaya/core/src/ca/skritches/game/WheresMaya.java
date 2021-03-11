package ca.skritches.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import ca.skritches.game.screens.PlayScreen;

public class WheresMaya extends Game {


	public static final int PIXEL_WIDTH = 400;
	public static final int PIXEL_HEIGHT = 208;
	public static final float GAME_WORLD_HEIGHT = 3;
	public static final float GAME_WORLD_WIDTH = 4;

	public SpriteBatch batch;


	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));

	}

	@Override
	public void render () {
	    super.render();
	}
	
	@Override
	public void dispose () {

		batch.dispose();
	}
}
