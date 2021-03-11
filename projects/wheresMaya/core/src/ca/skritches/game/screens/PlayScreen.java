package ca.skritches.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthoCachedTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import ca.skritches.game.WheresMaya;
import ca.skritches.game.scenes.Hud;
import jdk.nashorn.internal.objects.annotations.Where;

public class PlayScreen implements Screen {
    private WheresMaya game;
  // Texture texture;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private Hud hud;

    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    //box2d
    private World world;
    private Box2DDebugRenderer b2dr;


    public float aspectRatio = (float)WheresMaya.PIXEL_WIDTH /(float)WheresMaya.PIXEL_HEIGHT;
    public PlayScreen(WheresMaya game){
        this.game = game;
      //texture = new Texture("maya2.png");
       // gameCam = new OrthographicCamera(WheresMaya.GAME_WORLD_HEIGHT * aspectRatio, WheresMaya.GAME_WORLD_WIDTH);
        gameCam = new OrthographicCamera();
        //gameCam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        //gameCam.translate(gameCam.viewportWidth/2, gameCam.viewportHeight/2);
       // gameCam.position.set(gamePort.getWorldWidth()/2, gamePort.getWorldHeight()/2, 0);



        gamePort = new FitViewport(WheresMaya.PIXEL_WIDTH,WheresMaya.PIXEL_HEIGHT, gameCam);
        hud = new Hud(game.batch);

        mapLoader = new TmxMapLoader();
        map = mapLoader.load("level1_1.tmx");
        renderer = new OrthogonalTiledMapRenderer(map, 1);
        gameCam.position.set(gamePort.getWorldWidth() /2 , gamePort.getWorldHeight() /2, 0);

        world = new World(new Vector2(0,-10), true);
        b2dr = new Box2DDebugRenderer();

        BodyDef bdef = new BodyDef();
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();
        Body body;

        //ground
        for(MapObject object : map.getLayers().get(2).getObjects().getByType(RectangleMapObject.class)){

            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set(rect.getX() + rect.getWidth()/2, rect.getHeight()/2 + rect.getY());

            body = world.createBody(bdef);

            shape.setAsBox((rect.getWidth()/2),(rect.getHeight()/2));
            fdef.shape = shape;
            body.createFixture(fdef);
        }

        //blocks
        for(MapObject object : map.getLayers().get(3).getObjects().getByType(RectangleMapObject.class)){

            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set(rect.getX() + rect.getWidth()/2, rect.getHeight()/2 + rect.getY() );

            body = world.createBody(bdef);

            shape.setAsBox((rect.getWidth()/2),(rect.getHeight()/2));
            fdef.shape = shape;
            body.createFixture(fdef);
        }
        //the void
        for(MapObject object : map.getLayers().get(4).getObjects().getByType(RectangleMapObject.class)){

            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set(rect.getX() + rect.getWidth()/2, rect.getHeight()/2 + rect.getY() );

            body = world.createBody(bdef);

            shape.setAsBox((rect.getWidth()/2),(rect.getHeight()/2));
            fdef.shape = shape;
            body.createFixture(fdef);
        }

    }

    @Override
    public void show() {

    }
    public void handleInput(float dt){
        if(Gdx.input.isTouched())
            gameCam.position.x += 100 *dt;

    }
    public void update(float dt){
        handleInput(dt);
        world.step(1/60f, 6,2);
        gameCam.update();
        renderer.setView(gameCam);
    }
    @Override
    public void render(float delta) {
        update(delta);
        //clear screen to black
        Gdx.gl.glClearColor(0,0,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render();
        b2dr.render(world, gameCam.combined);

        //set batch to draw wat hud sees
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
       hud.stage.draw();
//

        /*
        game.batch.setProjectionMatrix(gameCam.combined);
        game.batch.begin();
        //game.batch.draw(batch);
        game.batch.draw(texture, 0,0);
        game.batch.end();
*/

    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
