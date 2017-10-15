package abstractart;

import acm.graphics.GOval;

/**
 *
 * @author trran
 */
public class GCircle extends GOval {

    public GCircle(double size) {
        super(size, size);
    }

    public GCircle(double x, double y, double size) {
        super(x, y, size, size);
    }
       
}
