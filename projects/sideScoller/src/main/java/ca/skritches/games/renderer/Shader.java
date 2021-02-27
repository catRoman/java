package ca.skritches.games.renderer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;

import static org.lwjgl.opengl.GL20.*;


public class Shader {

    private int shaderProgramID;
    private boolean beingUsed = false;

    private String vertexSource;
    private String fragmenetSource;
    private String fileName;
    

    public Shader(String fileName){
        this.fileName = fileName;
        try{
           
            StringBuffer sb = new StringBuffer();

            BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(this.fileName)));
            for (int c = br.read(); c != -1; c = br.read()) sb.append((char)c);
            
            String source = sb.toString(); 

           // alternate method might not work when jar is created
           // String source = new String(Files.readAllBytes(Paths.get(fileName)));
           
            String[] splitString = source.split("(#type)( )+([a-zA-Z]+)");
            
            //find first pattern after #type 'pattern'
            int index = source.indexOf("#type") + 6;
            int eol = source.indexOf("\n", index);
            String firstPattern = source.substring(index, eol).trim();
            
            //find second pattern after #type 'pattern'
            index = source.indexOf("#type", eol) + 6;
            eol = source.indexOf("\n", index);
            String secondPattern = source.substring(index, eol).trim();

            if(firstPattern.equals("vertex")){
                vertexSource = splitString[1];
            }else if (firstPattern.equals("fragment")){
                fragmenetSource = splitString[1];
            }else {
                throw new IOException("unexpected token '" + firstPattern + "'");
            }

            if(secondPattern.equals("vertex")){
                vertexSource = splitString[1];
            }else if (secondPattern.equals("fragment")){
                fragmenetSource = splitString[2];
            }else {
                throw new IOException("unexpected token '" + secondPattern + "'");
            }
        }catch(IOException ex){
            ex.printStackTrace();
            assert false : "Error: Could not open file for shader '" + fileName + "'";
        }

    }
 
    public void complieAndLink(){
        //=======================================
        // Compile and link shaders
        //=======================================

        int vertexID, fragmentID;
       
        //First load and compile the vertex shader
        vertexID = glCreateShader(GL_VERTEX_SHADER);
        // pass the shader source to the GPU
        glShaderSource(vertexID, vertexSource);
        glCompileShader(vertexID);
        
        // check for errors in compilation 
        int success = glGetShaderi(vertexID, GL_COMPILE_STATUS);
        if(success == GL_FALSE){
            int len = glGetShaderi(vertexID, GL_INFO_LOG_LENGTH);
            System.out.println("ERROR: '" + fileName + "'\n\tVertex shader compilation failed");
            System.out.println(glGetShaderInfoLog(vertexID,len));
            assert false : "";
        }

        //First load and compile the fragment shader
        fragmentID = glCreateShader(GL_FRAGMENT_SHADER);
        // pass the shader source to the GPU
        glShaderSource(fragmentID, fragmenetSource);
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
        shaderProgramID = glCreateProgram();
        glAttachShader(shaderProgramID, vertexID);    
        glAttachShader(shaderProgramID, fragmentID);
        glLinkProgram(shaderProgramID);

        //check for link errors
        success = glGetProgrami(shaderProgramID, GL_LINK_STATUS);
        if(success == GL_FALSE){
            int len = glGetProgrami(shaderProgramID, GL_INFO_LOG_LENGTH);
            System.out.println("ERROR: 'default.glsl'\n\tlinking shader failed");
            System.out.println(glGetProgramInfoLog(shaderProgramID, len));
            assert false : "";
        }
    }
    public void use(){
        if(!beingUsed){
        // Bind shader Program
            glUseProgram(shaderProgramID);
            beingUsed = true;
        }
    }
    public void detach(){
        glUseProgram(0);
        beingUsed = false;
    }
   
    public void uploadMat4f(String varName, Matrix4f mat4){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        FloatBuffer matBuffer = BufferUtils.createFloatBuffer(16);
        mat4.get(matBuffer); // {1 ,1 ,1 ,1 , 1 ......} (16 long)
        glUniformMatrix4fv(varLocation, false, matBuffer);
    }
    public void uploadMat3f(String varName, Matrix3f mat3){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        FloatBuffer matBuffer = BufferUtils.createFloatBuffer(9);
        mat3.get(matBuffer); // {1 ,1 ,1 ,1 , 1 ......} (9 long)
        glUniformMatrix3fv(varLocation, false, matBuffer);
    }

    public void uploadVec4f(String varName, Vector4f vec){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        glUniform4f(varLocation, vec.x, vec.y, vec.z, vec.w);

    }
    public void uploadVec3f(String varName, Vector3f vec){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        glUniform3f(varLocation, vec.x, vec.y, vec.z);

    }
    public void uploadVec2f(String varName, Vector2f vec){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        glUniform2f(varLocation, vec.x, vec.y);

    }

    public void uploadFloat(String varName, float val){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        glUniform1f(varLocation, val);

    }
    public void uploadInt(String varName, int val){
        int varLocation = glGetUniformLocation(shaderProgramID, varName);
        use();
        glUniform1i(varLocation, val);

    }
    
}
