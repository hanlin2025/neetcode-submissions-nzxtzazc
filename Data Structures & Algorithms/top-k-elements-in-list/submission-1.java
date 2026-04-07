class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> nMap = new HashMap<>();

        PriorityQueue<int[]> minHeap = 
        new PriorityQueue<>((a, b) -> a[1]- b[1]);

        for (int n : nums) {
            if (nMap.containsKey(n)) {
                nMap.put(n, nMap.get(n) + 1);
            } else {
                nMap.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : nMap.entrySet()) {
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll()[0];
        }

        return result;
    }
}
