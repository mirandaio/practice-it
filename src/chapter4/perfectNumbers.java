// there are several improvements that can be made...
public void perfectNumbers(int max) {
    System.out.print("Perfect numbers up to " + max + ":");
    for(int i = 6; i <= max; i+=2) {
        Queue<Integer> divisors = getProperDivisors(i);
        int sum = 0;
        
        for(int d : divisors)
            sum += d;
        
        if(i == sum)
            System.out.print(" " + i);
    }
}

Queue<Integer> getProperDivisors(int n) {
    Queue<Integer> q = new LinkedList<Integer>();
    for(int i = 1; i < n; i++) {
        if(n % i == 0)
            q.add(i);
    }
    return q;
}
