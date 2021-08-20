
import java.awt.*;

public class Magazine extends GameObject{

    public Magazine(int x, int y, int w, int h) {
        super(x, y, ID.Magazine, w, h, Color.blue);
        velY = -1;
        markedForDelete = false;
    }

    public void tick(){
        y += velY;
        removeEnemy();
    }

}