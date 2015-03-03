public void printSquares(int n) {
    List<Integer> list = new LinkedList<Integer>();
    printSquares(n, list, 1);
}

public void printSquares(int n, List<Integer> list, int i) {
    if(n < 0)
        return;
        
    if(n == 0) {
        printHelper(list);
        return;
    }
    
    if(i * i > n)
        return;
        
    list.add(i);
    printSquares(n - i * i, list, i + 1);
    list.remove(list.size() - 1);
    printSquares(n, list, i + 1);
}
