package ca.skritches.games.skritch;
 

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import ca.skritches.games.util.Time;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

// The singleton pattern 
public class Window {
   private int width, height;
   private String title;
   private long glfwWindow;
  
   private static float r, g, b, a;
   private static Window window = null;
   private static Scene currentScene = null;

    private Window() {
        this.height = 768;
        this.width = 1360;
        this.title = "Wheres Maya?";
        Window.r =1;
        Window.g = 1;
        Window.b = 1;
        Window.a = 1;

    }
    public static void changeScene(int newScene){
        switch(newScene){
            case 0:
                currentScene = new LevelEditorScene();
                currentScene.init();
                break;
            case 1:
                currentScene = new LevelScene();
                currentScene.init();
                break;
            case 2:
                currentScene = new TestScene();
                currentScene.init();
                break;
            default:
                assert false : "unknown scene '" + newScene + "'";
                break;
        }
    }
    public static void setBackgroundColor(float r, float b, float g, float a){
        Window.r = r;
        Window.b = b;
        Window.g = g;
        Window.a = a;
        
    }

    public static Window get(){
        if (Window.window == null){
            Window.window = new Window();
        }

        return Window.window;
    }
    
    public void run(){
        System.out.println("hello maya" + Version.getVersion() + "!");

        init();
        loop();
        
        //free the memory
       
       glfwFreeCallbacks(glfwWindow);
       glfwDestroyWindow(glfwWindow);

       //Terminate GLFW and free the error callback
       glfwTerminate();
       glfwSetErrorCallback(null).free();
    }

    public void init(){
        //setup an error callback
        GLFWErrorCallback.createPrint(System.err).set();

        //Initialize GLFW
        if(!glfwInit()){
            throw new IllegalStateException("unable to initialize GLFW");
        }
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);
        
        //create the window
        glfwWindow = glfwCreateWindow(this.width, this.height, this.title, MemoryUtil.NULL, MemoryUtil.NULL);
        if(glfwWindow == NULL){
            throw new IllegalStateException("Failed to create the GLFW window");
        }
        
        //callbacks for UI
        glfwSetCursorPosCallback(glfwWindow, MouseListener::mousePosCallback);
        glfwSetMouseButtonCallback(glfwWindow, MouseListener::mouseButtonCallback);
        glfwSetScrollCallback(glfwWindow, MouseListener::mouseScrollCallback);
        glfwSetKeyCallback(glfwWindow, KeyListener::keyCallback);

        //Make the OpenGL context current
        glfwMakeContextCurrent(glfwWindow);
        // Enable v-sync
        // cats note - matches FPS to monitor refresh rate
        // a roughly uniform 60 fps +- 3; when set to 1 with minimal spikes
        // maybe not when commented out i still get 60 fps
        // will have to look into when i have better understanding
        // feb26/21
        glfwSwapInterval(1);

        // Make the window visable
        glfwShowWindow(glfwWindow);

        // This line is critical for LWJGL's interoperation with GLFW's
		// OpenGL context, or any context that is managed externally.
		// LWJGL detects the context that is current in the current thread,
		// creates the GLCapabilities instance and makes the OpenGL
		// bindings available for use.
        GL.createCapabilities();
        Window.changeScene(0);
    }
    public void loop(){
        float beginTime = Time.getTime();
        float endTime;
        float dt = -1.0f;

        while(!glfwWindowShouldClose(glfwWindow)){
            //Poll events
            glfwPollEvents();

            glClearColor(Window.r, Window.g, Window.b, Window.a);
            glClear(GL_COLOR_BUFFER_BIT);

            if(dt >= 0)
                currentScene.update(dt);


            glfwSwapBuffers(glfwWindow);

            endTime = Time.getTime();
            dt = endTime - beginTime;
            beginTime = endTime;
        }
    }
}

