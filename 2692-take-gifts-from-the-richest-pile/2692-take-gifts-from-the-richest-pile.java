class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for(int i = 0; i < gifts.length; i++){
            maxHeap.add((double)gifts[i]);
        }

        // Perform 'k' operations on the largest gift piles
        for (int i = 0; i < k; i++) {
            if (!maxHeap.isEmpty()) {
                double num = maxHeap.poll();  // Remove the largest pile
                num = Math.sqrt(num);  // Take the floor of the square root of the pile
                maxHeap.add(num);  // Put the updated pile back into the heap
            }
        }

       // Sum up all the remaining gifts in the heap
        while (!maxHeap.isEmpty()) {
            sum += (long) (double)maxHeap.poll();  // Convert to long when summing
        }
        return sum;
    }
}