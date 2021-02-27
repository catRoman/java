package ca.skritches.games.skritch;
 

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

// The singleton pattern 
public class Window {
   private int width, height;
   private String title;
   private long glfwWindow;
   private float r, g, b, a;

   private static Window window = null;

    private Window() {
        this.height = 1080;
        this.width = 1920;
        this.title = "Wheres Maya?";
        this.r =1;
        this.g = 1;
        this.b = 1;
        this.a = 1;

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
        glfwSwapInterval(1);

        // Make the window visable
        glfwShowWindow(glfwWindow);

        // This line is critical for LWJGL's interoperation with GLFW's
		// OpenGL context, or any context that is managed externally.
		// LWJGL detects the context that is current in the current thread,
		// creates the GLCapabilities instance and makes the OpenGL
		// bindings available for use.
        GL.createCapabilities();

    }
    public void loop(){
        while(!glfwWindowShouldClose(glfwWindow)){
            //Poll events
            glfwPollEvents();

            glClearColor(this.r, this.g, this.b, this.a);
            glClear(GL_COLOR_BUFFER_BIT);

          

            
            if(KeyListener.isKeyPressed(GLFW_KEY_SPACE)){
                System.out.println("Space key is pressed");
                setColorFade(0,0,0,0);
            }
            if(MouseListener.mouseButtonDown(1)){
                System.out.println("Button one was pressed");
                setColorFade(2,2,2,2);
            }

            glfwSwapBuffers(glfwWindow);
        }
    }
    public void setColorFade(float r, float g, float b, float a){
                this.r = Math.max(this.r - 0.01f, r);
                this.g = Math.max(this.g - 0.01f, g);
                this.b = Math.max(this.b - 0.01f, b);
                this.a = Math.max(this.a - 0.01f, a);
    }
}

