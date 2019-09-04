import apcslib.*;

/**
 * Write a description of class Logo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Logo
{
    public static void main(String [] args)
    {
        DrawingTool myPencil;
        SketchPad myPad;
        
        myPad = new SketchPad(600, 600);
        myPencil = new DrawingTool(myPad);
        
        drawSquare(0, 0, 200, myPencil);
        
        drawEye(60, 150, 10, myPencil);
        drawEye(140, 150, 10, myPencil);
        
        drawNose(90, 100, myPencil);
    }
    
    static void drawNose(int x, int y, DrawingTool marker)
    {
     
        marker.up();
        marker.turnRight(180);
        marker.forward(y);
        marker.turnRight(90);
        marker.forward(x);
        marker.down();
        marker.drawString("nose");
        marker.up();
        marker.turnRight(180);
        marker.forward(x);
        marker.turnLeft(90);
        marker.forward(y);
            
    }
    
    static void drawEye(int x, int y, int r, DrawingTool marker)
    {
        marker.up();
        marker.turnRight(180);
        marker.forward(y);
        marker.turnRight(90);
        marker.forward(x);
        marker.down();
        marker.drawCircle(r);
        marker.up();
        marker.turnRight(180);
        marker.forward(x);
        marker.turnLeft(90);
        marker.forward(y);
        
    }
    
    /*
    static void drawRightEye(int x, int y, int r, DrawingTool marker)
    {
        marker.up();
        marker.forward(80);
        marker.down();
        marker.drawCircle(r);
    }*/
    
    static void drawSquare(int x, int y, int length, DrawingTool marker)
    {
        marker.up();
        marker.turnRight(90);
        marker.down();
        marker.forward(length);
        marker.turnLeft(90);
        marker.forward(length);
        marker.turnLeft(90);
        marker.forward(length);
        marker.turnLeft(90);
        marker.forward(length);
        
    }
}
