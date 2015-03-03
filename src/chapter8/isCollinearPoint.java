public boolean isCollinear(Point p1, Point p2) {
    if(this.x == p1.x || this.x == p2.x)
        return this.x == p1.x && this.x == p2.x;
        
    double m1 = ((double) (this.y - p1.y)) / (this.x - p1.x);
    double m2 = ((double) (this.y - p2.y)) / (this.x - p2.x);
    
    if(m1 == m2)
        return true;
        
    return false;
}
