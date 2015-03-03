public void printGrid(int row, int col) {
    for(int i = 1; i <= row; i++) {
        int end = i + row * (col - 1);
        for(int j = i; j <= end; j += row) {
            System.out.print(j);
            if(j != end) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
