class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();

        HashMap<String,List<String>> map=new HashMap<>();
    
        for(int i=0;i<strs.length;i++)
        {
            String word=strs[i];

            int[] freq=new int[26];
            for(int k=0;k<word.length();k++)
            {
                freq[word.charAt(k)-'a']++;
            }
            String key = Arrays.toString(freq);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }

        result.addAll(map.values());

        return result;
    }
}
