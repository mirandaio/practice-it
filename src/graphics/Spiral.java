public class Spiral {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(170, 170);
        Graphics g = panel.getGraphics();
        
        int len = 160;
        int startX = 0;
        int startY = 10;
        int endX = startX;
        int endY = startY;
        int i = 0;
        
        while(len > 0) {
            switch(i % 4) {
                case 0:
                endX += len;
                endY = startY;
                len -= 10;
                break;
                
                case 1:
                endX = startX;
                endY += len;
                break;
                
                case 2:
                endX -= len;
                endY = startY;
                len -= 10;
                break;
                
                case 3:
                endX = startX;
                endY -= len;
                break;
            }

            g.drawLine(startX, startY, endX, endY);
            startX = endX;
            startY = endY;
            i++;
        }
    }
}
