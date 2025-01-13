class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> matched = new ArrayList<String>();

        for(int i = 0; i < words.length; i++){
            int len = words[i].length();

            for(int j = 0; j < words.length; j++){
                if(i == j) continue;

                int len1 = words[j].length();

                if(len1 > len && words[j].contains(words[i])){
                    if(!matched.contains(words[i])) matched.add(words[i]);
                }
            }
        }

        return matched;
    }
}