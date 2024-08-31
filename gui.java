import java.awt.*;

public class gui extends Frame {
    public gui() {
        if (GraphicsEnvironment.isHeadless()) {
            System.err.println("Cannot run GUI in a headless environment");
            System.exit(1);
        }
        setTitle("GUI");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gui();
    }
}