package Shapes;

import java.awt.*;

public class Rect extends Shape implements Drawable {
    private int width;
    private int height;

    public Rect(Point initPos, Color col, int w, int h){ // The constructor
        super(initPos, col); // The constructor
        width = w;
        height = h;
    }
    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
