package abstractart;

import acm.graphics.GPolygon;

/**
 *
 * @author trran
 */
public class GTriangle extends GPolygon {
    
    private double boxWidth;
    private double boxHeight;
    
    public GTriangle(double boxWidth, double boxHeight){
        this(0, 0, boxWidth, boxHeight);
    }
    
    public GTriangle(double xpos, double ypos, double boxWidth, double boxHeight){
      super(xpos, ypos);
      this.boxWidth = boxWidth;
      this.boxHeight = boxHeight;
      calculateVertices();
    }
    
    private void calculateVertices(){
        clear();
        addVertex(boxWidth/2.0, 0.0);
        addVertex(0.0, boxHeight);
        addVertex(boxWidth, boxHeight);
    }
    
    public void setWidth(double width){
        if(boxWidth!=width){
            boxWidth=width;
            calculateVertices();
        }
    }
    
    public void setHeight(double height){
        if(boxHeight!=height){
            calculateVertices();
        }
    }
}
