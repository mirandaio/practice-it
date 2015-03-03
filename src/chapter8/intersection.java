public Rectangle intersection(Rectangle rect) {
    if(this.getX() + this.getWidth() < rect.getX() ||
        rect.getX() + rect.getWidth() < this.getX() ||
        this.getY() + this.getHeight() < rect.getY() ||
        rect.getY() + rect.getHeight() < this.getY())
        return null;
        
    int startX = Math.max(this.getX(), rect.getX());
    int endX = Math.min(this.getX() + this.getWidth(),
        rect.getX() + rect.getWidth());
    int startY = Math.max(this.getY(), rect.getY());
    int endY = Math.min(this.getY() + this.getHeight(),
        rect.getY() + rect.getHeight());
        
    return new Rectangle(startX, startY, endX - startX, endY - startY);
}
