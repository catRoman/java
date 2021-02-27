package ca.skritches.games.skritch;

import static org.lwjgl.opengl.GL20.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.BufferUtils;

import ca.skritches.games.renderer.Shader;

import static org.lwjgl.opengl.ARBVertexArrayObject.*;


public class LevelEditorScene extends Scene{
    
    private Shader defaultShader;
    private int vaoID, vboID, eboID;

    private float[] vertexArray = {
        // position             //color
        0.5f, -0.5f, 0.0f,       1.0f, 0.0f, 0.0f, 1.0f, // 0 Bottom right
        -0.5f, 0.5f, 0.0f,       0.0f, 1.0f, 0.0f, 1.0f, // 1 top left
         0.5f, 0.5f, 0.0f,       0.0f, 0.0f, 1.0f, 1.0f, // 2 top right
        -0.5f, -0.5f, 0.0f,       1.0f, 1.0f, 0.0f, 1.0f, // 3 bottom left
    };

    //IMPORTANT: Must be in counter clockwise order
    private int[] elementArray = {
        /*
            x(1)            x(2)
                           
                           
            x(3)            x(0)
            
        */

        2, 1, 0, // Top right triangle
        0, 1, 3  // Bottom right triangle

    };

    public LevelEditorScene(){
    }

    @Override
    public void init(){
        
        defaultShader = new Shader("/default.glsl");
        defaultShader.complieAndLink();

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
        int floatSizeBytes = 4;
        int vertexSizeBytes = (positionSize + colorSize) * floatSizeBytes;
        glVertexAttribPointer(0, positionSize, GL_FLOAT, false, vertexSizeBytes, 0);
        glEnableVertexAttribArray(0);

        glVertexAttribPointer(1, colorSize, GL_FLOAT, false, vertexSizeBytes, positionSize * floatSizeBytes);
        glEnableVertexAttribArray(1);


    }

    @Override
    public void update(float dt){
       defaultShader.use();
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
