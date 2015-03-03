public class ShowDesign2 {
    public static void main(String[] args) {
        showDesign(300, 100);
    }
    
    public static void showDesign(int width, int height) {
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        for(int i = 1; i <= 4; i++)
            g.drawRect(30 * i, 10 * i, width - 60 * i, height - 20 * i);
    }
}
