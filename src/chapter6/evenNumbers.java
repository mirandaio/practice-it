public void evenNumbers(Scanner sc) {
    int count = 0;
    int evenCount = 0;
    int sum = 0;
    
    while(sc.hasNext()) {
        int num = sc.nextInt();
        count++;
        sum += num;
        
        if(num % 2 == 0)
            evenCount++;
    }
    
    double percent = (double)(evenCount * 100) / count;
    System.out.println(count + " numbers, sum = " + sum);
    System.out.println(evenCount + " evens (" +
        String.format("%.2f", percent) + "%)");
}
