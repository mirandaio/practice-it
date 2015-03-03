public double pay(double sal, int h) {
    return h > 8 ? sal * h + (h - 8) * 0.5 * sal : sal * h;
}
