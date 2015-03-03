public class Squares {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 200);
        Graphics g = panel.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.RED);
        
        for(int i = 1; i <= 5; i++)
            g.drawRect(50, 50, 20 * i, 20 * i);
            
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 150, 150);
    }
}
