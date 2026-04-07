class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
            TODO:
            1. Map to save the integer and frequent
            2. loop k times
            3. output the int array result
        */

        HashMap<Integer, Integer> nMap = new HashMap<>();

        for (int n : nums) {
            if (nMap.containsKey(n)) {
                nMap.put(n, nMap.get(n) + 1);
            } else {
                nMap.put(n, 1);
            }
        }

        ArrayList<Integer> rList = new ArrayList<>();

        while (k > 0) {
            Integer n = nMap.entrySet().stream()
                            .max(Map.Entry.comparingByValue())
                            .get()
                            .getKey();
            if (!rList.contains(n)) {
                rList.add(n);
                nMap.remove(n);
                k--;
            }
        }

        int[] rArray = rList.stream().mapToInt(i->i).toArray();

        return rArray;
    }
}
