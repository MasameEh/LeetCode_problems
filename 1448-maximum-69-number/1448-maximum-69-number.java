class Solution {
    public int maximum69Number (int num) {

        String str = Integer.toString(num);
        StringBuilder strNum = new StringBuilder(str);

        for(int i = 0; i < strNum.length(); i++){
            if(strNum.charAt(i) == '6'){
                strNum.setCharAt(i, '9');
                break;
            }
        }

        int numb = Integer.parseInt(strNum.toString());
        return numb;
    }
}