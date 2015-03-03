public boolean anglePairs(int a, int b, int c) {
    boolean complementary = a + b == 90 || a + c == 90 || b + c == 90;
    boolean supplementary = a + b == 180 || a + c == 180 || b + c == 180;
    return complementary && supplementary;
}
