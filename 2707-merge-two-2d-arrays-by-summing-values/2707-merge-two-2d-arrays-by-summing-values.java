class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        Map<Integer, Integer> idsValues = new TreeMap<>();

        for(int i = 0; i < nums1.length; i++){
            int id = nums1[i][0];
            int value = nums1[i][1];

            idsValues.put(id, value);
        }

        for(int i = 0; i < nums2.length; i++){
            int id = nums2[i][0];
            int value = nums2[i][1];

            idsValues.put(id, idsValues.getOrDefault(id, 0) + value);
        }


        int[][] summingValues = new int[idsValues.size()][2];
        int i = 0;
        System.out.println(idsValues);

        for(Map.Entry<Integer, Integer> entry : idsValues.entrySet()){
            summingValues[i][0] = entry.getKey();
            summingValues[i][1] = entry.getValue();
            i++;
        }
        return summingValues;

    }
}