public Rectangle union(Rectangle rect) {
    int newX = Math.min(this.getX(), rect.getX());
    int newY = Math.min(this.getY(), rect.getY());
    int newWidth = Math.max(rect.getX() + rect.getWidth() - newX,
        this.getX() + this.getWidth() - newX);
    int newHeight = Math.max(rect.getY() + rect.getHeight() - newY,
        this.getY() + this.getHeight() - newY);
    return new Rectangle(newX, newY, newWidth, newHeight);
}
