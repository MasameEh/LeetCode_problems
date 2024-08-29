class Solution {
    public String sortSentence(String s) {
        String[] arr =  s.split(" ");
        String[] sentence = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            int l = arr[i].length();
            String word = arr[i];
            int index = word.charAt(l - 1) - '0';
            String newWord = word.replace(Character.toString(word.charAt(l - 1)),"");

            sentence[index - 1] = newWord;
        }

        String result = String.join(" ", sentence);

        return result;
    }
}