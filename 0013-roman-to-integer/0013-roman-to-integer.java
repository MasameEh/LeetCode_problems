class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;

        if(s.contains("IV")){
            s = s.replace("IV", "IIII");
        }
        if(s.contains("IX")){
            s = s.replace("IX", "VIIII");
        }
        if(s.contains("XL")){
           s =  s.replace("XL", "XXXX");
        }
        if(s.contains("XC")){
            s = s.replace("XC", "LXXXX");
        }
        if(s.contains("CD")){
            s = s.replace("CD", "CCCC");
        }
        if(s.contains("CM")){
            s = s.replace("CM", "DCCCC");
        }
        System.out.println(s);

        for(int i = 0; i < s.length(); i++) 
        {
            switch(s.charAt(i)) {
                case 'I': 
                    num = 1; 
                    break;
                case 'V': 
                    num = 5; 
                    break;
                case 'X': 
                    num = 10;
                    break;
                case 'L':
                    num = 50; 
                    break;
                case 'C':
                    num = 100; 
                    break;
                case 'D': 
                    num = 500; 
                    break;
                case 'M': 
                    num = 1000; 
                    break;
            }
            ans+=num;
        }
        return ans;
    }
}