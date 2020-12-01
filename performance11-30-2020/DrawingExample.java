

import objectdraw.*;
import java.awt.*;

public class DrawingExample extends WindowController
{
    private Location initialPoint;
    
    public void onMousePress(Location pressPoint)
    {
        //new Text("pressed", pressPoint, canvas);
        initialPoint = pressPoint;
}

    public void onMouseDrag(Location releasePoint)
    {
        //new Text("released", releasePoint, canvas);
        new Line(initialPoint, releasePoint, canvas);
        initialPoint = releasePoint;
}
}