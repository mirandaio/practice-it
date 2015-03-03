public int quadrant() {
    if(this.y > 0 && this.x > 0) {
        return 1;
    } else if(this.x < 0 && this.y > 0) {
        return 2;
    } else if(this.x < 0 && this.y < 0) {
        return 3;
    } else if(this.x > 0 && this.y < 0) {
        return 4;
    } else {
        return 0;
    }
}
