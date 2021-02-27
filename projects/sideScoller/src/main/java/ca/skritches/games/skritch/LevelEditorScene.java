package ca.skritches.games.skritch;

import static org.lwjgl.opengl.GL20.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.joml.Vector2f;
import org.lwjgl.BufferUtils;

import ca.skritches.games.renderer.Shader;
import ca.skritches.games.util.Time;

import static org.lwjgl.opengl.ARBVertexArrayObject.*;


public class LevelEditorScene extends Scene{
    
    private Shader defaultShader;
    private int vaoID, vboID, eboID;
    private Texture testTexture;

    private float[] vertexArray = {
        // position                   //color                       //uv coordinates  
         100.5f,    0.5f, 0.0f,       1.0f, 0.0f, 0.0f, 1.0f,       1, 1, // 0 Bottom right
           0.5f,  100.5f, 0.0f,       0.0f, 1.0f, 0.0f, 1.0f,       0, 0, // 1 top left
         100.5f,  100.5f, 0.0f,       0.0f, 0.0f, 1.0f, 1.0f,       1, 0, // 2 top right
           0.5f,    0.5f, 0.0f,       1.0f, 1.0f, 0.0f, 1.0f,       0, 1, // 3 bottom left
    };

    //IMPORTANT: Must be in counter clockwise order
    private int[] elementArray = {
        /*
            x(1)            x(2)
                           
                           
            x(3)            x(0)position
            
        */

        2, 1, 0, // Top right triangle
        0, 1, 3  // Bottom right triangle

    };

    public LevelEditorScene(){
    }

    @Override
    public void init(){
        Window.setBackgroundColor(0, 0, 0, 0);
        this.camera = new Camera(new Vector2f());
        defaultShader = new Shader("/default.glsl");
        defaultShader.complieAndLink();
        this.testTexture = new Texture("src/main/resources/maya2.png");


        //=============================================
        // Generate VAO, VBO, and EBO buf Shader testShaderfer Objects, 
        //  and send to GPU
        //=============================================
        vaoID = glGenVertexArrays();
        glBindVertexArray(vaoID);

        //create a float buffer of vertices

        FloatBuffer vertexBuffer = BufferUtils.createFloatBuffer(vertexArray.length);
        vertexBuffer.put(vertexArray).flip();

        //create VBO upload the vertex buffer
        vboID = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, vboID);
        glBufferData(GL_ARRAY_BUFFER, vertexBuffer, GL_STATIC_DRAW);

        //create the indices and upload
        IntBuffer elementBuffer = BufferUtils.createIntBuffer(elementArray.length);
        elementBuffer.put(elementArray).flip();

        eboID = glGenBuffers(); 
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, eboID);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER, elementBuffer, GL_STATIC_DRAW);

        //Add the vertex attribute pointer
        int positionSize = 3;
        int colorSize = 4;
        int uvSize = 2;
        int vertexSizeBytes = (positionSize + colorSize + uvSize) * Float.BYTES;
        glVertexAttribPointer(0, positionSize, GL_FLOAT, false, vertexSizeBytes, 0);
        glEnableVertexAttribArray(0);

        glVertexAttribPointer(1, colorSize, GL_FLOAT, false, vertexSizeBytes, positionSize * Float.BYTES);
        glEnableVertexAttribArray(1);

        glVertexAttribPointer(2, uvSize, GL_FLOAT, false, vertexSizeBytes, (positionSize + colorSize) * Float.BYTES);
        glEnableVertexAttribArray(2);

    }

    @Override
    public void update(float dt){
        camera.position.x -= dt * 50.0f;
       // camera.position.y -= dt * 50.0f;
        
       defaultShader.use();

       //upload texture to shader
       defaultShader.uploadTexture("TEX_SAMPLE", 0);
       glActiveTexture(GL_TEXTURE);
       testTexture.bind();

       defaultShader.uploadMat4f("uProjection", camera.getProjectionMatrix());
       defaultShader.uploadMat4f("uView", camera.getViewMatrix());
       defaultShader.uploadFloat("uTime", Time.getTime());
      
       // bind the VAO that were using
       glBindVertexArray(vaoID);

       //Enable the vertex attribute pointers
       glEnableVertexAttribArray(0);
       glEnableVertexAttribArray(1);

       glDrawElements(GL_TRIANGLES,elementArray.length, GL_UNSIGNED_INT, 0);

       //unbind everything
       glDisableVertexAttribArray(0);
       glDisableVertexAttribArray(1);

       glBindVertexArray(0);

       defaultShader.detach();

    }
    
}
