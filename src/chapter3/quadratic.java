public void quadratic(int a, int b, int c) {
    double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    System.out.println("First root = " + r1);
    System.out.println("Second root = " + r2);
}
