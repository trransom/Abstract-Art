package abstractart;

import acm.graphics.GFillable;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import java.awt.Color;

/**
 *
 * @author trran
 */
public class ShapeFactory {
    
    public static GObject createShape(ShapeType shapeType, 
            double x, double y, double width, double height, Color color){
        GObject gobj = null;
        switch(shapeType){
            case RECT:
                gobj = new GRect(x, y, width, height);
                break;
            case OVAL:
                gobj = new GOval(x, y, width, height);
                break;
            case CIRCLE:
                gobj = new GCircle(x, y, Math.min(width, height));
                break;
            case LINE:
                gobj = new GLine(x, y, x+width, y+height);
                break;
            case TRIANGLE:
                gobj = new GTriangle(x, y, width, height);
                break;
        }
        if(gobj instanceof GFillable){
            ((GFillable) gobj).setFilled(true);
            ((GFillable) gobj).setFillColor(color);
        } else {
            gobj.setColor(color);
        }
        return gobj;
    }
    }
        
    
    

