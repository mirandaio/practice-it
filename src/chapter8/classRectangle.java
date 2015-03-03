public class Rectangle {
    int x;
    int y;
    int width;
    int height;
    
    public Rectangle(int x, int y, int width, int height) {
        if(width < 0 || height < 0)
            throw new IllegalArgumentException();
            
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height="
            + height + "]";
    }
}
