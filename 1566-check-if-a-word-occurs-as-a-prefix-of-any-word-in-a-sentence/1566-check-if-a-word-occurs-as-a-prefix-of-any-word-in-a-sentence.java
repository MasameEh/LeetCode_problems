class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        List<String> words = new ArrayList<String>();
        int index = 0, n = searchWord.length();
        System.out.println(n);

        for (String val: sentence.split(" ")){
        
            if(val.contains(searchWord) && val.substring(0, n).equals(searchWord) ){
                return ++index;
            }
            index++;
        }
        return -1;
    }
}