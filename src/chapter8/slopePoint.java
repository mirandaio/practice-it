public double slope(Point other) {
    if(this.x == other.x)
        throw new IllegalArgumentException();
        
    return ((double) (this.y - other.y)) / (this.x - other.x);
}
