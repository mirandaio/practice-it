public double getSlope() {
    if(p1.getX() == p2.getX())
        throw new IllegalStateException();
        
    return ((double)(p2.getY() - p1.getY())) / (p2.getX() - p1.getX());
}
