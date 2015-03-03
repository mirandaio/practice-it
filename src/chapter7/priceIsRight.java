public int priceIsRight(int[] bids, int price) {
    int bid = -1;
    
    for(int i = 0; i < bids.length; i++) {
        if(price - bids[i] >= 0 && bids[i] > bid)
            bid = bids[i];
    }
    
    return bid;
}
