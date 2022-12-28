import org.lwjgl.system.windows.DISPLAY_DEVICE;

public class HelloWorld {
    public static void main(String[] args){
        DISPLAY_DEVICE.create();
        System.out.println("Testing HelloWorld by Java");
    }
}