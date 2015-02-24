public void subtract(TimeSpan span) {
    int m = this.minutes - span.minutes + 60 * (this.hours - span.hours);
    this.hours = m / 60;
    this.minutes = m % 60;
}
