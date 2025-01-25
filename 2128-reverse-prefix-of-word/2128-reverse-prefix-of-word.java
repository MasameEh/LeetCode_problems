class Solution {
    public String reversePrefix(String word, char ch) {

        char [] strArr = word.toCharArray();
        String ret = "";

        if(word.indexOf(ch) != -1){
            
            int len = word.length();
            int start = 0;
            int index = word.indexOf(ch);
            int end = index;

            while(start <= end){
                char temp = strArr[start];
                strArr[start] = strArr[end];
                strArr[end] = temp;

                start++;
                end--;
            }
        }

        return String.valueOf(strArr);
    }

}