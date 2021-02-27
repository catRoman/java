package ca.skritches.games.skritch;

import static org.lwjgl.opengl.GL20.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.BufferUtils;

import static org.lwjgl.opengl.ARBVertexArrayObject.*;


public class TestScene extends Scene{
    private String vertexShaderSrc = "" +
            "#version 330 core\n" +
            "layout (location=0) in vec3 aPos;\n" +
            "layout (location=1) in vec4 aColor;\n" +
            "\n" +
            "out vec4 fColor;\n" +
            "\n" +
            "void main(){\n" +  
                "fColor = aColor;\n" +  
                "gl_Position = vec4(aPos, 1.0);\n" +  
            "}";

    private String fragmentShaderSrc = "" +
            "#version 330 core\n" +

            "in vec4 fColor;\n" +
            "out vec4 color;\n" +
            "\n" +
            "void main(){\n" +
                "color = fColor;\n" +
            "}";


    private int vertexID, fragmentID, shaderProgram;

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
    private int vaoID, vboID, eboID;

    public TestScene(){
  
    }
    @Override
    public void init(){
        //change background color of window
        Window.setBackgroundColor(0, 0, 0, 0);

        //=======================================
        // Compile and link shaders
        //=======================================

        //First load and compile the vertex shader
        vertexID = glCreateShader(GL_VERTEX_SHADER);
        // pass the shader source to the GPU
        glShaderSource(vertexID, vertexShaderSrc);
        glCompileShader(vertexID);
        
        // check for errors in compilation 
        int success = glGetShaderi(vertexID, GL_COMPILE_STATUS);
        if(success == GL_FALSE){
            int len = glGetShaderi(vertexID, GL_INFO_LOG_LENGTH);
            System.out.println("ERROR: 'default.glsl'\n\tVertex shader compilation failed");
            System.out.println(glGetShaderInfoLog(vertexID,len));
            assert false : "";
        }

        //First load and compile the fragment shader
        fragmentID = glCreateShader(GL_FRAGMENT_SHADER);
        // pass the shader source to the GPU
        glShaderSource(fragmentID, fragmentShaderSrc);
        glCompileShader(fragmentID);
        
        // check for errors in compilation 
        success = glGetShaderi(fragmentID, GL_COMPILE_STATUS);
        if(success == GL_FALSE){
            int len = glGetShaderi(fragmentID, GL_INFO_LOG_LENGTH);
            System.out.println("ERROR: 'default.glsl'\n\tfragment shader compilation failed");
            System.out.println(glGetShaderInfoLog(fragmentID,len));
            assert false : "";
        }

        //link shader and check for errors
        shaderProgram = glCreateProgram();
        glAttachShader(shaderProgram, vertexID);    
        glAttachShader(shaderProgram, fragmentID);
        glLinkProgram(shaderProgram);

        //check for link errors
        success = glGetProgrami(shaderProgram, GL_LINK_STATUS);
        if(success == GL_FALSE){
            int len = glGetProgrami(shaderProgram, GL_INFO_LOG_LENGTH);
            System.out.println("ERROR: 'default.glsl'\n\tlinking shader failed");
            System.out.println(glGetProgramInfoLog(shaderProgram, len));
            assert false : "";
        }


        //=============================================
        // Generate VAO, VBO, and EBO buffer Objects, 
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
       //bind shader program
       glUseProgram(shaderProgram);
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

       glUseProgram(0);

    }
    
}
