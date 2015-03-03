public void printTriangleType(int a, int b, int c) {
    if(a == b && b == c) {
        System.out.println("equilateral");
    } else if(a == b || a == c || b == c) {
        System.out.println("isosceles");
    } else {
        System.out.println("scalene");
    }
}
