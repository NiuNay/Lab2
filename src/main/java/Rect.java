import java.awt.*;

public class Rect {
    private Point pos;
    private int width;
    private int height;
    private Color col;

    public Rect(Point initPos, Color col, int w, int h){ // The constructor
        width = w;
        height = h;
        pos=initPos;
        this.col=col;
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
