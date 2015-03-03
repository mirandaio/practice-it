public class ShowDesign {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 200);
        Graphics g = panel.getGraphics();
        for(int i = 0; i < 4; i++)
            g.drawRect(20 + 20 * i, 20 + 20 * i, 160 - 40 * i, 160 - 40 * i);
    }
}
