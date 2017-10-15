package abstractart;

import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * 
 * @author trran
 */

public class AbstractArt extends GraphicsProgram{
    
    private RandomGenerator rand = RandomGenerator.getInstance();
    
    public void init(){
        JButton redrawButton = new JButton("Redraw");
        redrawButton.addActionListener((ActionEvent ae) -> {
          run();
        });
        add(redrawButton, SOUTH);
    }
    /**
     * Creates a drawing with a random number of shapes.
     */
    public void run(){
        this.removeAll();
        int shapeCount = rand.nextInt(50, 200);
        for(int i=0;i<shapeCount;++i){
            int shapeTypeNumber = rand.nextInt(ShapeType.values().length);
            ShapeType shapeType = ShapeType.values()[shapeTypeNumber];
            int shapeWidth = rand.nextInt(20, getWidth()/2);
            int shapeHeight = rand.nextInt(20, getHeight()/2);
            Color shapeColor = rand.nextColor();
            int shapeX = rand.nextInt(5, getWidth()-shapeWidth-5);
            int shapeY = rand.nextInt(5, getHeight()-shapeHeight-5);
            GObject shape = ShapeFactory.createShape(shapeType,
                    shapeX, shapeY, shapeWidth, shapeHeight, shapeColor);
            add(shape);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new AbstractArt().start();
    }
}
