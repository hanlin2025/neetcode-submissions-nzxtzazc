class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
            TODO:
            no order -> no sort?
            all lowercase
            
            1. brute force way
                - 2 for loop
                - i = current strs, j = i+1, +2...
                - if same, add it into the list
                - until end, go to next strs
            2. using hashmap or hashset
                - create hashmap for each item
                - compare their hashmap
                - same hashmap put into same list

            output: 
            1. seems like a 2D list
            2. total number is the same -> example1 and example2
        */

        List<List<String>> rList = new ArrayList<>();
        ArrayList<Integer> pairedIndex = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (pairedIndex.contains(i)) {
                continue;
            }

            ArrayList<String> cList = new ArrayList<>();
            cList.add(strs[i]); // must contains itself

            if (i == strs.length - 1) {
                rList.add(cList);
                break;
            }

            String[] iStrArray = strs[i].split("");
            Arrays.sort(iStrArray);

            for (int j = i + 1; j < strs.length; j++) {
                if (pairedIndex.contains(j)) {
                continue;
                }

                String[] jStrArray = strs[j].split("");
                Arrays.sort(jStrArray);
                if (Arrays.equals(iStrArray, jStrArray)) {
                    cList.add(strs[j]);
                    pairedIndex.add(j);
                }
            }

            rList.add(cList);
        }

        return rList;
    }
}
