class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int n = s.length();
        int count = 0;
        // count the number of ones
        for (auto value:s){
            if (value == '1'){
                count++;
            }
        }

        s = string(n,'0');
        if (count == 0){
            return s;

        }else{
            s[n-1] = '1';
            count--;
            for (int i = 0 ; i < count; i++){
                s[i] = '1';
            }
        }
        return s;
    }
};