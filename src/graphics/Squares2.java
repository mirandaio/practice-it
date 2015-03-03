public class Squares2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 300);
        Graphics g = panel.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 400, 300);
        drawFigure(g, 50, 50);
        drawFigure(g, 250, 10);
        drawFigure(g, 180, 115);
    }
    
    public static void drawFigure(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        
        for(int i = 1; i <= 5; i++)
            g.drawRect(x, y, 20 * i, 20 * i);
            
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + 100, y + 100);
    }
}
