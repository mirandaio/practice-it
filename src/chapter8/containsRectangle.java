public boolean contains(int x, int y) {
    return this.x <= x && x <= this.x + width && this.y <= y &&
        y <= this.y + height;
}

public boolean contains(Point p) {
    return contains(p.getX(), p.getY());
}
