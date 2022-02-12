package Quesba;

public class MaximumNumberOfEventsThatCanBeAttended {
	class Solution {
	    static int maxEvents(int[] start, int[] end, int n) {
	        // code here
	        Pair [] pairArray = new Pair[n];
	        for (int i = 0; i < n; i++) {
	            pairArray[i] = new Pair(start[i], end[i]);
	        }
	        Arrays.sort(pairArray, (pair1, pair2) -> Integer.compare(pair1.getStart(), pair2.getStart()));
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        int index = 0;
	        int dayCount = 0;
	        for (int day = 1; day <= 100000; day++) {
	            while (index < n && pairArray[index].getStart() == day) {
	                minHeap.offer(pairArray[index++].getEnd());
	            }
	            while (!minHeap.isEmpty() && minHeap.peek() < day) {
	                minHeap.poll();
	            }
	            if (!minHeap.isEmpty()) {
	                dayCount += 1;
	                minHeap.poll();
	            }
	        }
	        return dayCount;
	    }
	}

	class Pair {
	    private int start;
	    private int end;
	    
	    public Pair(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }
	    
	    public int getStart() {
	        return start;
	    }
	    
	    public int getEnd() {
	        return end;
	    }
	}
}
