import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle circle;
    private Rect rect;

    // Constructor
    public Drawing() {
        circle=new Circle(new Point(200,200),new Color(0x992266),80);
        rect=new Rect(new Point(100,100),new Color(0x922266),80, 30);

        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    public void paint(Graphics g){ // WHEN DOES THIS EVER GET CALLED?
        circle.draw(g);
        rect.draw(g);
    }
}
