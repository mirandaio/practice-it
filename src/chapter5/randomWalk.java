public void randomWalk() {
    int position = 0;
    int max = 0;
    Random r = new Random();
    int step;
    
    while(-3 < position && position < 3) {
        System.out.println("position = " + position);
        step = r.nextBoolean() ? -1 : 1;
        position += step;
        max = Math.max(max, position);
    }
    
    System.out.println("position = " + position);
    System.out.println("max position = " + max);
}
