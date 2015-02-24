public void scale(int factor) {
    this.hours = factor * this.hours + (factor * this.minutes) / 60;
    this.minutes = (factor * this.minutes) % 60;
}
