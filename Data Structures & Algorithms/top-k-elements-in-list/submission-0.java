class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int largest = 0;
        int secondLargest = 0;
        int mf = 0;
        int smf = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();

            if (freq > mf) {
                smf = mf;
                secondLargest = largest;
                mf = freq;
                largest = number;

            } else if (freq > smf) {
                smf = freq;
                secondLargest = number;
            }
        }
        for (int number : map.keySet()) {
            list.add(number);
        }
        list.sort((a, b) -> map.get(b) - map.get(a));
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
